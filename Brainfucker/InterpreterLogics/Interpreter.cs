using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Brainfucker.InterpreterLogics
{
    class Interpreter
    {
        public Interpreter()
        {
            GlobalMemory.Clear();
        }

        public void Interpret(string s)
        {
            int i = 0;
            int right = s.Length;

            if(!_Verify(s))
                throw new Exception("Bad loops.");          //Защита от дурака

            while (i < right)
            {
                switch (s[i])
                {
                    case '>':
                        {
                            GlobalMemory.Ptr++;
                            if (GlobalMemory.Ptr >= GlobalMemory.Bufsize)
                            {
                                GlobalMemory.Ptr = 0;
                            }
                            break;
                        }
                    case '<':
                        {
                            GlobalMemory.Ptr--;
                            if (GlobalMemory.Ptr < 0)
                            {
                                GlobalMemory.Ptr = GlobalMemory.Bufsize - 1;
                            }
                            break;
                        }
                    case '.':
                        {
                            Console.Write((char)GlobalMemory.Buf[GlobalMemory.Ptr]);
                            break;
                        }
                    case '+':
                        {
                            GlobalMemory.Buf[GlobalMemory.Ptr]++;
                            break;
                        }
                    case '-':
                        {
                            GlobalMemory.Buf[GlobalMemory.Ptr]--;
                            break;
                        }
                    case '[':                                   //Открываем цикл
                        {
                            if (GlobalMemory.Buf[GlobalMemory.Ptr] == 0)                //Если на поинтере 0, то надо пройти до конца цикла, не выполняя инструкций
                            {
                                int loop = 1;                   //Считаем, что есть один цикл
                                while (loop > 0)                //Пока он не закончен
                                {
                                    i++;                        //Сдвигаем вправо
                                    var c = s[i];               //Берем символ
                                    if (c == '[')               //Если еще один открывающий цикл
                                        loop++;                 //Увеличиваем
                                    else if (c == ']')          //Если находим закрывающую скобку
                                    {
                                        loop--;                 //Уменьшаем количество циклов
                                    }
                                }
                            }
                            break;
                        }
                    case ']':                                   //Видим закрывающую скобку
                        {
                            int loop = 1;                       //Считаем, чт оесть один цикл
                            while (loop > 0)                    //Пока цикл не закрыт
                            {
                                i--;                            //Уменьшаем поинтер
                                char c = s[i];
                                if (c == '[')                   //Если видим открывающую скобку
                                {
                                    loop--;                     //Закрываем цикл
                                }
                                else
                                if (c == ']')                   //Видим еще закрывающую
                                {
                                    loop++;                     //Добавляем цикл
                                }
                            }
                            i--;                                //Отходим назад
                            break;
                        }
                    case ',':
                        {
                            ConsoleKeyInfo key = Console.ReadKey();
                            GlobalMemory.Buf[GlobalMemory.Ptr] = Convert.ToByte(key.KeyChar);
                            break;
                        }
                }
                i++;
            }
        }

        private bool _Verify(string s)
        {
            int rbs = 0, lbs = 0;
            foreach (char t in s)
            {
                switch (t)
                {
                    case '[':
                        rbs++;
                        break;
                    case ']':
                        lbs++;
                        break;
                }
            }

            return rbs == lbs;
        }
    }
}
