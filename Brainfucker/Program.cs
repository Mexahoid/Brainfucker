using System;
using System.IO;

namespace Brainfucker
{
    class BrainFuckInterpreter
    {
        private const int Bufsize = 65535;
        private readonly int[] _buf = new int[Bufsize];
        private int _ptr;

        public BrainFuckInterpreter()
        {
            _ptr = 0;
            Array.Clear(_buf, 0, _buf.Length);
        }

        public void Interpret(string s)
        {
            int i = 0;
            int right = s.Length;
            while (i < right)
            {
                switch (s[i])
                {
                    case '>':
                        {
                            _ptr++;
                            if (_ptr >= Bufsize)
                            {
                                _ptr = 0;
                            }
                            break;
                        }
                    case '<':
                        {
                            _ptr--;
                            if (_ptr < 0)
                            {
                                _ptr = Bufsize - 1;
                            }
                            break;
                        }
                    case '.':
                        {
                            Console.Write((char)_buf[_ptr]);
                            break;
                        }
                    case '+':
                        {
                            _buf[_ptr]++;
                            break;
                        }
                    case '-':
                        {
                            _buf[_ptr]--;
                            break;
                        }
                    case '[':
                        {
                            if (_buf[_ptr] == 0)
                            {
                                int loop = 1;
                                while (loop > 0)
                                {
                                    i++;
                                    var c = s[i];
                                    if (c == '[')
                                        loop++;
                                    else if (c == ']')
                                    {
                                        loop--;
                                    }
                                }
                            }
                            break;
                        }
                    case ']':
                        {
                            int loop = 1;
                            while (loop > 0)
                            {
                                i--;
                                char c = s[i];
                                if (c == '[')
                                {
                                    loop--;
                                }
                                else
                                if (c == ']')
                                {
                                    loop++;
                                }
                            }
                            i--;
                            break;
                        }
                    case ',':
                        {
                            ConsoleKeyInfo key = Console.ReadKey();
                            _buf[_ptr] = key.KeyChar;
                            break;
                        }
                }
                i++;
            }
        }

        private static void Main(string[] args)
        {
            BrainFuckInterpreter bf = new BrainFuckInterpreter();
            string src = Console.ReadLine();
            bf.Interpret(src);
            Console.ReadKey();
        }
    }
}