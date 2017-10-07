using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Brainfucker.InterpreterLogics;

namespace Brainfucker.AST
{
    class AstLoopNode : AstNode
    {
        public AstLoopNode(Operation opCode) : base(opCode)
        {

        }

        public AstNode LoopNode { get; set; }
        public int NumPointer { get; set; }

        protected override AstNode _Operate(AstNode pointer)
        {
            switch (OpCode)
            {
                case Operation.Rbracket:
                    AstNode ptr = this;
                    if (GlobalMemory.Buf[((AstLoopNode)LoopNode).NumPointer] != 0)
                        return LoopNode;
                    else
                    {
                        return pointer.NextNode;
                    }
                default:
                    return pointer.NextNode;
            }
        }
    }
}