// $ANTLR 3.4 D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g 2017-10-01 18:49:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BrainfuckerLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BrainfuckerLexer() {} 
    public BrainfuckerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BrainfuckerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g"; }

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:4:7: ( ',' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:4:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:5:7: ( '.' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:5:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:6:7: ( '[' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:6:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "MVLEFT"
    public final void mMVLEFT() throws RecognitionException {
        try {
            int _type = MVLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:20:9: ( '<' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:20:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MVLEFT"

    // $ANTLR start "MVRIGHT"
    public final void mMVRIGHT() throws RecognitionException {
        try {
            int _type = MVRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:21:9: ( '>' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:21:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MVRIGHT"

    // $ANTLR start "INCR"
    public final void mINCR() throws RecognitionException {
        try {
            int _type = INCR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:22:6: ( '+' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:22:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCR"

    // $ANTLR start "DECR"
    public final void mDECR() throws RecognitionException {
        try {
            int _type = DECR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:23:6: ( '-' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:23:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECR"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:24:9: ( ']' )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:24:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:26:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:27:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:27:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



                _channel=Hidden;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:8: ( INPUT | PRINT | WHILE | MVLEFT | MVRIGHT | INCR | DECR | RBRACKET | WS )
        int alt2=9;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt2=1;
            }
            break;
        case '.':
            {
            alt2=2;
            }
            break;
        case '[':
            {
            alt2=3;
            }
            break;
        case '<':
            {
            alt2=4;
            }
            break;
        case '>':
            {
            alt2=5;
            }
            break;
        case '+':
            {
            alt2=6;
            }
            break;
        case '-':
            {
            alt2=7;
            }
            break;
        case ']':
            {
            alt2=8;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt2=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:10: INPUT
                {
                mINPUT(); 


                }
                break;
            case 2 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:16: PRINT
                {
                mPRINT(); 


                }
                break;
            case 3 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:22: WHILE
                {
                mWHILE(); 


                }
                break;
            case 4 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:28: MVLEFT
                {
                mMVLEFT(); 


                }
                break;
            case 5 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:35: MVRIGHT
                {
                mMVRIGHT(); 


                }
                break;
            case 6 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:43: INCR
                {
                mINCR(); 


                }
                break;
            case 7 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:48: DECR
                {
                mDECR(); 


                }
                break;
            case 8 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:53: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 9 :
                // D:\\Data\\Projects\\Brainfucker\\Brainfucker\\Brainfucker.g:1:62: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}