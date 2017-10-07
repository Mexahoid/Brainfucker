using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Brainfucker.InterpreterLogics;

namespace Brainfucker.AST
{
    class ASTree
    {
        private AstNode _head;
        private List<Tuple<int, int>> lsTuples;

        public ASTree()
        {
            _head = new AstPrimitiveNode(AstNode.Operation.Program)
            {
                PrevNode = null
            };
        }

        public void CreateTree(string s)
        {
            var ll = new LoopLogics();
            lsTuples = ll.FillPointers(s);
            for (int i = 0; i < s.Length; i++)
            {
                AstNode tmp = _CreateNode(s[i], i);
                if (tmp != null)
                {
                    AstNode pointerNode = _head;
                    while (pointerNode.NextNode != null)
                        pointerNode = pointerNode.NextNode;
                    pointerNode.NextNode = tmp;
                    tmp.PrevNode = pointerNode;
                }
            }
            SetCorrespondingNodes();
            SetUpPointers();
        }

        private AstNode _CreateNode(char c, int pos)
        {
            switch (c)
            {
                case '>':
                    return new AstPrimitiveNode(AstNode.Operation.Mvright);
                case '<':
                    return new AstPrimitiveNode(AstNode.Operation.Mvleft);
                case '-':
                    return new AstPrimitiveNode(AstNode.Operation.Subtract);
                case '+':
                    return new AstPrimitiveNode(AstNode.Operation.Add);
                case '.':
                    return new AstPrimitiveNode(AstNode.Operation.Dot);
                case ',':
                    return new AstPrimitiveNode(AstNode.Operation.Comma);
                case '[':
                    return new AstLoopNode(AstNode.Operation.Lbracket);
                case ']':
                    return new AstLoopNode(AstNode.Operation.Rbracket); 
                default:
                    return null;
            }
        }

        private void SetCorrespondingNodes()
        {
            int pos = 0;
            AstNode pointer = _head.NextNode;
            while (pointer != null)
            {
                if (pointer.OpCode == AstNode.Operation.Lbracket)
                {
                    AstLoopNode nd = (AstLoopNode) pointer;
                    nd.LoopNode = _GetCorrespondingOpenLoopNode(pos);
                    ((AstLoopNode) nd.LoopNode).LoopNode = nd;
                }
                pos++;
                pointer = pointer.NextNode;
            }
        }

        private AstNode _GetCorrespondingOpenLoopNode(int lbracketPos)
        {
            foreach (var tuple in lsTuples)
            {
                if (tuple.Item1 == lbracketPos)
                {
                    AstNode tmp = _head.NextNode;
                    int count = 0;
                    while (count++ != tuple.Item2)
                        tmp = tmp.NextNode;
                    return tmp;
                }
            }
            return null;
        }


        public void PrintTree()
        {
            AstNode ptr = _head;
            AstNode prev = null;
            int indent = 0;
            int loop = 0;
            while (ptr != null)
            {
                if (prev?.OpCode == AstNode.Operation.Lbracket)
                {
                    indent += 4;
                    loop++;
                }
                if (ptr.OpCode == AstNode.Operation.Rbracket)
                {
                    indent -= 4;
                    loop--;
                }

                string filler;
                string ender;
                string starter;
                if (ptr == _head)
                {
                    starter = ender = filler = "";
                }
                else
                {
                    starter = indent > 0 ? "│" : "├";

                    string midder = indent > 4 ? "│" : "";

                    ender = indent < 4 ? "─" : "├";

                    filler = "";
                    for (int i = 0; i < loop; i++)
                    {
                        filler += "   " + midder;
                    }
                    if (midder.Equals("│"))
                        filler = filler.Remove(filler.Length - 2, 2);
                }


                Console.WriteLine(starter + filler + ender + ptr.Print());

                prev = ptr;
                ptr = ptr.NextNode;
            }
            Console.WriteLine("End");
        }


        public void Evaluate()
        {
            AstNode ptr = _head;
            while (ptr != null)
            {
               ptr = ptr.Activate(ptr);
            }
        }

        private void SetUpPointers()
        {
            AstNode ptr = _head;
            int pointer = 0;
            while (ptr != null)
            {
                switch (ptr.OpCode)
                {
                    case AstNode.Operation.Mvright:
                        pointer++;
                        if (pointer > 65535)
                            pointer = 0;
                        break;
                    case AstNode.Operation.Mvleft:
                        pointer--;
                        if (pointer < 0)
                            pointer = GlobalMemory.Bufsize - 1;
                        break;
                    case AstNode.Operation.Lbracket:
                        ((AstLoopNode) ptr).NumPointer = pointer;
                        break;
                }

                ptr = ptr.NextNode;
            }
        }
    }
}
