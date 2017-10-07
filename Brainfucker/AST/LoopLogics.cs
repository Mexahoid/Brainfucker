using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Brainfucker.AST
{
    class LoopLogics
    {
        private readonly List<int> rightBracketsIds;
        private readonly List<int> leftBracketsIds;
        

        private int brackets;

        public LoopLogics()
        {
            rightBracketsIds = new List<int>();
            leftBracketsIds = new List<int>();
        }

        public List<Tuple<int, int>> FillPointers(string s)
        {
            List<Tuple<int, int>> lsTuples = new List<Tuple<int, int>>();
            if (!_Verify(s, out brackets))
                throw new Exception("Bad loops");
            Stack<int> st = new Stack<int>();
            for (int i = 0; i < s.Length; i++)
            {
                switch (s[i])
                {
                    case '[':
                        st.Push(i);
                        break;
                    case ']':
                        int index = st.Any() ? st.Pop() : -1;
                        lsTuples.Add(new Tuple<int, int>(index, i));
                        break;
                }
            }

            if(brackets != lsTuples.Count)
                throw new Exception("WTF exception");

            return lsTuples;
        }

        private bool _Verify(string s, out int num)
        {
            int rbs = 0, lbs = 0;
            for (int i = 0; i < s.Length; i++)
            {
                switch (s[i])
                {
                    case '[':
                        lbs++;
                        leftBracketsIds.Add(i);
                        break;
                    case ']':
                        rbs++;
                        rightBracketsIds.Add(i);
                        break;
                }
            }
            num = rbs;
            return rbs == lbs;
        }
    }
}
