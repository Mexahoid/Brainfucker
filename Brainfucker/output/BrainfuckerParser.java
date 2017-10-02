// $ANTLR 3.4 D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g 2017-10-01 18:49:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class BrainfuckerParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "DECR", "INCR", "INPUT", "MVLEFT", "MVRIGHT", "PRINT", "PROGRAM", "RBRACKET", "UNKNOWN", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int BLOCK=4;
    public static final int DECR=5;
    public static final int INCR=6;
    public static final int INPUT=7;
    public static final int MVLEFT=8;
    public static final int MVRIGHT=9;
    public static final int PRINT=10;
    public static final int PROGRAM=11;
    public static final int RBRACKET=12;
    public static final int UNKNOWN=13;
    public static final int WHILE=14;
    public static final int WS=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "file", "complex", "simple"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public BrainfuckerParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public BrainfuckerParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public BrainfuckerParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return BrainfuckerParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g"; }



    // $ANTLR start "file"
    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:16:1: file : ( complex )+ ;
    public final void file() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "file");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:16:6: ( ( complex )+ )
            dbg.enterAlt(1);

            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:16:8: ( complex )+
            {
            dbg.location(16,8);
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:16:8: ( complex )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHILE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:16:8: complex
            	    {
            	    dbg.location(16,8);
            	    pushFollow(FOLLOW_complex_in_file132);
            	    complex();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "file");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "file"



    // $ANTLR start "complex"
    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:17:1: complex : WHILE ( simple )* RBRACKET ;
    public final void complex() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "complex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:17:9: ( WHILE ( simple )* RBRACKET )
            dbg.enterAlt(1);

            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:17:11: WHILE ( simple )* RBRACKET
            {
            dbg.location(17,11);
            match(input,WHILE,FOLLOW_WHILE_in_complex140); 
            dbg.location(17,17);
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:17:17: ( simple )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= DECR && LA2_0 <= PRINT)) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:17:17: simple
            	    {
            	    dbg.location(17,17);
            	    pushFollow(FOLLOW_simple_in_complex142);
            	    simple();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(17,25);
            match(input,RBRACKET,FOLLOW_RBRACKET_in_complex145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "complex");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "complex"



    // $ANTLR start "simple"
    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:18:1: simple : ( MVLEFT | MVRIGHT | INCR | DECR | PRINT | INPUT );
    public final void simple() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "simple");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:18:8: ( MVLEFT | MVRIGHT | INCR | DECR | PRINT | INPUT )
            dbg.enterAlt(1);

            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:
            {
            dbg.location(18,8);
            if ( (input.LA(1) >= DECR && input.LA(1) <= PRINT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simple");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "simple"

    // Delegated rules


 

    public static final BitSet FOLLOW_complex_in_file132 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WHILE_in_complex140 = new BitSet(new long[]{0x00000000000017E0L});
    public static final BitSet FOLLOW_simple_in_complex142 = new BitSet(new long[]{0x00000000000017E0L});
    public static final BitSet FOLLOW_RBRACKET_in_complex145 = new BitSet(new long[]{0x0000000000000002L});

}