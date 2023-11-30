// $ANTLR 3.5.3 DualLang.g 2023-11-30 21:08:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DualLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int BOOL=6;
	public static final int CMP=7;
	public static final int COMMENT=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int END=11;
	public static final int ERROR=12;
	public static final int ESC_SEQ=13;
	public static final int EXPONENT=14;
	public static final int FLOAT=15;
	public static final int FUNCTION=16;
	public static final int HEX_DIGIT=17;
	public static final int ID=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int LOOP=21;
	public static final int MUL=22;
	public static final int NOT=23;
	public static final int OCTAL_ESC=24;
	public static final int OR=25;
	public static final int RECEIVE=26;
	public static final int SEND=27;
	public static final int STRING=28;
	public static final int THEN=29;
	public static final int TYPE=30;
	public static final int UNICODE_ESC=31;
	public static final int WHILE=32;
	public static final int WS=33;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DualLangLexer() {} 
	public DualLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DualLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "DualLang.g"; }

	// $ANTLR start "SEND"
	public final void mSEND() throws RecognitionException {
		try {
			int _type = SEND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:20:2: ( 'send' )
			// DualLang.g:20:4: 'send'
			{
			match("send"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEND"

	// $ANTLR start "RECEIVE"
	public final void mRECEIVE() throws RecognitionException {
		try {
			int _type = RECEIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:23:2: ( 'receive' )
			// DualLang.g:23:4: 'receive'
			{
			match("receive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECEIVE"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:27:7: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// DualLang.g:27:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// DualLang.g:27:18: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:30:6: ( '&&' )
			// DualLang.g:30:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:33:5: ( '||' )
			// DualLang.g:33:7: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:36:5: ( '!' )
			// DualLang.g:36:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "CMP"
	public final void mCMP() throws RecognitionException {
		try {
			int _type = CMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:39:5: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
			int alt2=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt2=1;
				}
				break;
			case '!':
				{
				alt2=2;
				}
				break;
			case '<':
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3=='=') ) {
					alt2=5;
				}

				else {
					alt2=3;
				}

				}
				break;
			case '>':
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4=='=') ) {
					alt2=6;
				}

				else {
					alt2=4;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// DualLang.g:39:7: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// DualLang.g:39:14: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// DualLang.g:39:20: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// DualLang.g:39:24: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// DualLang.g:39:28: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// DualLang.g:39:33: '>='
					{
					match(">="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CMP"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:42:5: ( '*' | '/' )
			// DualLang.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:45:5: ( '-' | '+' )
			// DualLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:50:5: ( 'if' )
			// DualLang.g:50:7: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:53:7: ( 'else' )
			// DualLang.g:53:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:56:7: ( 'then' )
			// DualLang.g:56:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "LOOP"
	public final void mLOOP() throws RecognitionException {
		try {
			int _type = LOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:62:7: ( 'loop' )
			// DualLang.g:62:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOP"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:65:6: ( 'end' )
			// DualLang.g:65:8: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:68:4: ( 'do' )
			// DualLang.g:68:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:71:7: ( 'while' )
			// DualLang.g:71:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:75:10: ( 'func' )
			// DualLang.g:75:12: 'func'
			{
			match("func"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:78:7: ( 'int' | 'float' | 'char' | 'string' | 'void' )
			int alt3=5;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt3=1;
				}
				break;
			case 'f':
				{
				alt3=2;
				}
				break;
			case 'c':
				{
				alt3=3;
				}
				break;
			case 's':
				{
				alt3=4;
				}
				break;
			case 'v':
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// DualLang.g:78:9: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// DualLang.g:78:17: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// DualLang.g:78:26: 'char'
					{
					match("char"); 

					}
					break;
				case 4 :
					// DualLang.g:78:35: 'string'
					{
					match("string"); 

					}
					break;
				case 5 :
					// DualLang.g:78:46: 'void'
					{
					match("void"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:83:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// DualLang.g:83:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// DualLang.g:83:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// DualLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:87:5: ( ( '0' .. '9' )+ )
			// DualLang.g:87:7: ( '0' .. '9' )+
			{
			// DualLang.g:87:7: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// DualLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:92:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt12=3;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// DualLang.g:92:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// DualLang.g:92:9: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// DualLang.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match('.'); 
					// DualLang.g:92:25: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// DualLang.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
							break loop7;
						}
					}

					// DualLang.g:92:37: ( EXPONENT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// DualLang.g:92:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// DualLang.g:93:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// DualLang.g:93:13: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// DualLang.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// DualLang.g:93:25: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// DualLang.g:93:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// DualLang.g:94:9: ( '0' .. '9' )+ EXPONENT
					{
					// DualLang.g:94:9: ( '0' .. '9' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// DualLang.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:99:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// DualLang.g:99:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// DualLang.g:99:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\\') ) {
					alt13=1;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// DualLang.g:99:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// DualLang.g:99:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop13;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:103:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='/') ) {
					alt17=1;
				}
				else if ( (LA17_1=='*') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// DualLang.g:103:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// DualLang.g:103:14: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// DualLang.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop14;
						}
					}

					// DualLang.g:103:28: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// DualLang.g:103:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// DualLang.g:104:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// DualLang.g:104:14: ( options {greedy=false; } : . )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='*') ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1=='/') ) {
								alt16=2;
							}
							else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
								alt16=1;
							}

						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// DualLang.g:104:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop16;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:107:7: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// DualLang.g:107:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// DualLang.g:107:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// DualLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ERROR"
	public final void mERROR() throws RecognitionException {
		try {
			int _type = ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// DualLang.g:109:9: ( . )
			// DualLang.g:109:11: .
			{
			matchAny(); 
			System.err.println("Lexer error: Unexpected character '" + getText() + "'");
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// DualLang.g:114:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// DualLang.g:114:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// DualLang.g:114:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// DualLang.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// DualLang.g:114:33: ( '0' .. '9' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// DualLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// DualLang.g:117:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// DualLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// DualLang.g:121:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt21=1;
					}
					break;
				case 'u':
					{
					alt21=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt21=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// DualLang.g:121:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// DualLang.g:122:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// DualLang.g:123:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// DualLang.g:128:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='\\') ) {
				int LA22_1 = input.LA(2);
				if ( ((LA22_1 >= '0' && LA22_1 <= '3')) ) {
					int LA22_2 = input.LA(3);
					if ( ((LA22_2 >= '0' && LA22_2 <= '7')) ) {
						int LA22_4 = input.LA(4);
						if ( ((LA22_4 >= '0' && LA22_4 <= '7')) ) {
							alt22=1;
						}

						else {
							alt22=2;
						}

					}

					else {
						alt22=3;
					}

				}
				else if ( ((LA22_1 >= '4' && LA22_1 <= '7')) ) {
					int LA22_3 = input.LA(3);
					if ( ((LA22_3 >= '0' && LA22_3 <= '7')) ) {
						alt22=2;
					}

					else {
						alt22=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// DualLang.g:128:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// DualLang.g:129:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// DualLang.g:130:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// DualLang.g:135:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// DualLang.g:135:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// DualLang.g:1:8: ( SEND | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | TYPE | ID | INT | FLOAT | STRING | COMMENT | WS | ERROR )
		int alt23=25;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// DualLang.g:1:10: SEND
				{
				mSEND(); 

				}
				break;
			case 2 :
				// DualLang.g:1:15: RECEIVE
				{
				mRECEIVE(); 

				}
				break;
			case 3 :
				// DualLang.g:1:23: BOOL
				{
				mBOOL(); 

				}
				break;
			case 4 :
				// DualLang.g:1:28: AND
				{
				mAND(); 

				}
				break;
			case 5 :
				// DualLang.g:1:32: OR
				{
				mOR(); 

				}
				break;
			case 6 :
				// DualLang.g:1:35: NOT
				{
				mNOT(); 

				}
				break;
			case 7 :
				// DualLang.g:1:39: CMP
				{
				mCMP(); 

				}
				break;
			case 8 :
				// DualLang.g:1:43: MUL
				{
				mMUL(); 

				}
				break;
			case 9 :
				// DualLang.g:1:47: ADD
				{
				mADD(); 

				}
				break;
			case 10 :
				// DualLang.g:1:51: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// DualLang.g:1:54: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// DualLang.g:1:59: THEN
				{
				mTHEN(); 

				}
				break;
			case 13 :
				// DualLang.g:1:64: LOOP
				{
				mLOOP(); 

				}
				break;
			case 14 :
				// DualLang.g:1:69: END
				{
				mEND(); 

				}
				break;
			case 15 :
				// DualLang.g:1:73: DO
				{
				mDO(); 

				}
				break;
			case 16 :
				// DualLang.g:1:76: WHILE
				{
				mWHILE(); 

				}
				break;
			case 17 :
				// DualLang.g:1:82: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 18 :
				// DualLang.g:1:91: TYPE
				{
				mTYPE(); 

				}
				break;
			case 19 :
				// DualLang.g:1:96: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// DualLang.g:1:99: INT
				{
				mINT(); 

				}
				break;
			case 21 :
				// DualLang.g:1:103: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 22 :
				// DualLang.g:1:109: STRING
				{
				mSTRING(); 

				}
				break;
			case 23 :
				// DualLang.g:1:116: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 24 :
				// DualLang.g:1:124: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// DualLang.g:1:127: ERROR
				{
				mERROR(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA12_eotS =
		"\5\uffff";
	static final String DFA12_eofS =
		"\5\uffff";
	static final String DFA12_minS =
		"\2\56\3\uffff";
	static final String DFA12_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA12_specialS =
		"\5\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "91:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\4\35\2\32\1\47\1\32\2\uffff\1\51\1\uffff\7\35\1\uffff\1\64\2"+
		"\32\3\uffff\2\35\1\uffff\6\35\7\uffff\1\101\4\35\1\106\3\35\1\uffff\1"+
		"\64\3\uffff\10\35\1\uffff\1\122\1\35\1\124\1\35\1\uffff\3\35\1\131\2\35"+
		"\1\134\1\135\1\35\1\137\1\35\1\uffff\1\141\1\uffff\1\142\1\35\2\122\1"+
		"\uffff\2\35\2\uffff\1\134\1\uffff\1\122\2\uffff\1\146\1\122\1\35\1\uffff"+
		"\1\150\1\uffff";
	static final String DFA23_eofS =
		"\151\uffff";
	static final String DFA23_minS =
		"\1\0\2\145\1\150\1\141\1\46\1\174\2\75\2\uffff\1\52\1\uffff\1\146\1\154"+
		"\2\157\2\150\1\157\1\uffff\1\56\1\60\1\0\3\uffff\1\156\1\162\1\uffff\1"+
		"\143\1\165\1\145\1\154\1\156\1\157\7\uffff\1\60\1\164\1\163\1\144\1\157"+
		"\1\60\1\151\1\141\1\151\1\uffff\1\56\3\uffff\1\144\1\151\2\145\1\156\1"+
		"\163\1\143\1\141\1\uffff\1\60\1\145\1\60\1\160\1\uffff\1\154\1\162\1\144"+
		"\1\60\1\156\1\151\2\60\1\145\1\60\1\164\1\uffff\1\60\1\uffff\1\60\1\145"+
		"\2\60\1\uffff\1\147\1\166\2\uffff\1\60\1\uffff\1\60\2\uffff\2\60\1\145"+
		"\1\uffff\1\60\1\uffff";
	static final String DFA23_maxS =
		"\1\uffff\1\164\1\145\1\162\1\165\1\46\1\174\2\75\2\uffff\1\57\1\uffff"+
		"\2\156\2\157\2\150\1\157\1\uffff\1\145\1\71\1\uffff\3\uffff\1\156\1\162"+
		"\1\uffff\1\143\1\165\1\145\1\154\1\156\1\157\7\uffff\1\172\1\164\1\163"+
		"\1\144\1\157\1\172\1\151\1\141\1\151\1\uffff\1\145\3\uffff\1\144\1\151"+
		"\2\145\1\156\1\163\1\143\1\141\1\uffff\1\172\1\145\1\172\1\160\1\uffff"+
		"\1\154\1\162\1\144\1\172\1\156\1\151\2\172\1\145\1\172\1\164\1\uffff\1"+
		"\172\1\uffff\1\172\1\145\2\172\1\uffff\1\147\1\166\2\uffff\1\172\1\uffff"+
		"\1\172\2\uffff\2\172\1\145\1\uffff\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\11\uffff\2\7\1\uffff\1\11\7\uffff\1\23\3\uffff\1\10\1\30\1\31\2\uffff"+
		"\1\23\6\uffff\1\4\1\5\1\7\1\6\1\27\1\10\1\11\11\uffff\1\24\1\uffff\1\25"+
		"\1\26\1\30\10\uffff\1\12\4\uffff\1\17\13\uffff\1\22\1\uffff\1\16\4\uffff"+
		"\1\1\2\uffff\1\3\1\14\1\uffff\1\21\1\uffff\1\13\1\15\3\uffff\1\20\1\uffff"+
		"\1\2";
	static final String DFA23_specialS =
		"\1\1\26\uffff\1\0\121\uffff}>";
	static final String[] DFA23_transitionS = {
			"\11\32\2\31\2\32\1\31\22\32\1\31\1\7\1\27\3\32\1\5\3\32\1\30\1\14\1\32"+
			"\1\14\1\26\1\13\12\25\2\32\1\11\1\10\1\12\2\32\32\24\4\32\1\24\1\32\2"+
			"\24\1\22\1\20\1\16\1\4\2\24\1\15\2\24\1\17\5\24\1\2\1\1\1\3\1\24\1\23"+
			"\1\21\3\24\1\32\1\6\uff83\32",
			"\1\33\16\uffff\1\34",
			"\1\36",
			"\1\40\11\uffff\1\37",
			"\1\41\12\uffff\1\43\10\uffff\1\42",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\46",
			"",
			"",
			"\1\50\4\uffff\1\50",
			"",
			"\1\53\7\uffff\1\54",
			"\1\55\1\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"",
			"\1\66\1\uffff\12\65\13\uffff\1\66\37\uffff\1\66",
			"\12\66",
			"\0\67",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"\1\66\1\uffff\12\65\13\uffff\1\66\37\uffff\1\66",
			"",
			"",
			"",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\123",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\132",
			"\1\133",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\136",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\140",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\143",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\144",
			"\1\145",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\147",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SEND | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | TYPE | ID | INT | FLOAT | STRING | COMMENT | WS | ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_23 = input.LA(1);
						s = -1;
						if ( ((LA23_23 >= '\u0000' && LA23_23 <= '\uFFFF')) ) {s = 55;}
						else s = 26;
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='s') ) {s = 1;}
						else if ( (LA23_0=='r') ) {s = 2;}
						else if ( (LA23_0=='t') ) {s = 3;}
						else if ( (LA23_0=='f') ) {s = 4;}
						else if ( (LA23_0=='&') ) {s = 5;}
						else if ( (LA23_0=='|') ) {s = 6;}
						else if ( (LA23_0=='!') ) {s = 7;}
						else if ( (LA23_0=='=') ) {s = 8;}
						else if ( (LA23_0=='<') ) {s = 9;}
						else if ( (LA23_0=='>') ) {s = 10;}
						else if ( (LA23_0=='/') ) {s = 11;}
						else if ( (LA23_0=='+'||LA23_0=='-') ) {s = 12;}
						else if ( (LA23_0=='i') ) {s = 13;}
						else if ( (LA23_0=='e') ) {s = 14;}
						else if ( (LA23_0=='l') ) {s = 15;}
						else if ( (LA23_0=='d') ) {s = 16;}
						else if ( (LA23_0=='w') ) {s = 17;}
						else if ( (LA23_0=='c') ) {s = 18;}
						else if ( (LA23_0=='v') ) {s = 19;}
						else if ( ((LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'b')||(LA23_0 >= 'g' && LA23_0 <= 'h')||(LA23_0 >= 'j' && LA23_0 <= 'k')||(LA23_0 >= 'm' && LA23_0 <= 'q')||LA23_0=='u'||(LA23_0 >= 'x' && LA23_0 <= 'z')) ) {s = 20;}
						else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {s = 21;}
						else if ( (LA23_0=='.') ) {s = 22;}
						else if ( (LA23_0=='\"') ) {s = 23;}
						else if ( (LA23_0=='*') ) {s = 24;}
						else if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 25;}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\b')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\u001F')||(LA23_0 >= '#' && LA23_0 <= '%')||(LA23_0 >= '\'' && LA23_0 <= ')')||LA23_0==','||(LA23_0 >= ':' && LA23_0 <= ';')||(LA23_0 >= '?' && LA23_0 <= '@')||(LA23_0 >= '[' && LA23_0 <= '^')||LA23_0=='`'||LA23_0=='{'||(LA23_0 >= '}' && LA23_0 <= '\uFFFF')) ) {s = 26;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
