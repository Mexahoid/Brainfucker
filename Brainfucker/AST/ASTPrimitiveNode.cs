using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Brainfucker.InterpreterLogics;

namespace Brainfucker.AST
{
    class AstPrimitiveNode : AstNode
    {
        public AstPrimitiveNode(Operation opCode) : base(opCode)
        {

        }

        protected override AstNode _Operate(AstNode pointer)
        {
            switch (OpCode)
            {
                case Operation.Add:
                    GlobalMemory.Buf[GlobalMemory.Ptr]++;
                    break;
                case Operation.Subtract:
                    GlobalMemory.Buf[GlobalMemory.Ptr]--;
                    break;
                case Operation.Mvleft:
                    GlobalMemory.Ptr--;
                    if (GlobalMemory.Ptr < 0)
                        GlobalMemory.Ptr = GlobalMemory.Bufsize - 1;
                    break;
                case Operation.Mvright:
                    GlobalMemory.Ptr++;
                    if (GlobalMemory.Ptr >= GlobalMemory.Bufsize)
                        GlobalMemory.Ptr = 0;
                    break;
                case Operation.Dot:
                    Console.Write((char)GlobalMemory.Buf[GlobalMemory.Ptr]);
                    break;
                case Operation.Comma:
                    ConsoleKeyInfo key = Console.ReadKey();
                    GlobalMemory.Buf[GlobalMemory.Ptr] = Convert.ToByte(key.KeyChar);
                    break;
            }
            return pointer.NextNode;
        }
    }
}
