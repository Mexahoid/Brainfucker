using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Brainfucker.InterpreterLogics
{
    public static class GlobalMemory
    {
        public const int Bufsize = 65535;
        public static int Ptr { get; set; }

        public static readonly byte[] Buf = new byte[Bufsize];


        public static void Clear()
        {
            Ptr = 0;
            Array.Clear(Buf, 0, Buf.Length);
        }
    }
}
