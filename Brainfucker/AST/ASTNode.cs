using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Brainfucker.InterpreterLogics;

namespace Brainfucker.AST
{
    internal class AstNode
    {
        public enum Operation
        {
            Add,
            Subtract,
            Mvleft,
            Mvright,
            Dot,
            Comma,
            Rbracket,
            Lbracket,
            Program
        }
        internal AstNode NextNode { get; set; }
        internal AstNode PrevNode { get; set; }
        internal Operation OpCode { get; }

        protected AstNode(Operation opCode)
        {
            OpCode = opCode;
            NextNode = null;
        }

        public AstNode Activate(AstNode pointer)
        {
            if (OpCode == Operation.Program)
            {
                GlobalMemory.Clear();
                return pointer.NextNode;
            }
                return _Operate(pointer);
        }

        protected virtual AstNode _Operate(AstNode pointer)
        {
            return null;
        }

        public string Print()
        {
            switch (OpCode)
            {
                case Operation.Add:
                    return "─ +";
                case Operation.Subtract:
                    return "─ -";
                case Operation.Mvleft:
                    return "─ <";
                case Operation.Mvright:
                    return "─ >";
                case Operation.Dot:
                    return "─ .";
                case Operation.Comma:
                    return "─ ,";
                case Operation.Rbracket:
                    return "─ ]";
                case Operation.Lbracket:
                    return "─ [";
                case Operation.Program:
                    return "Program start";
                default:
                    throw new ArgumentOutOfRangeException();
            }
        }
    }
}
