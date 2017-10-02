import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        BrainfuckerLexer lex = new BrainfuckerLexer(new ANTLRFileStream("D:\\Data\\Projects\\Brainfucker\\Brainfucker\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        BrainfuckerParser g = new BrainfuckerParser(tokens, 49100, null);
        try {
            g.file();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}