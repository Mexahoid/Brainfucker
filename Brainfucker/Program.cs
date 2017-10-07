using System;
using System.IO;
using Brainfucker.AST;
using Brainfucker.InterpreterLogics;

namespace Brainfucker
{
    class Program
    {
        private static void Main(string[] args)
        {
            ASTree ast = new ASTree();
            Interpreter bf = new Interpreter();
            string src = Console.ReadLine();
            try
            {
                ast.CreateTree(src);
                ast.PrintTree();
                ast.Evaluate();
                
                //bf.Interpret(src);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}