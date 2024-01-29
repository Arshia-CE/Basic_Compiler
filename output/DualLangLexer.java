// $ANTLR 3.5.1 C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g 2024-01-30 01:34:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DualLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
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
	public static final int STRING=27;
	public static final int THEN=28;
	public static final int TYPE=29;
	public static final int UNICODE_ESC=30;
	public static final int WHILE=31;
	public static final int WS=32;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:2:7: ( '%' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:2:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:3:7: ( '(' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:4:7: ( ')' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:5:7: ( '++' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:5:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:6:7: ( ',' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:6:9: ','
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:7:7: ( '--' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:7:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:8:7: ( ';' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:9:7: ( '=' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:9:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:7: ( 'BREAK' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:10:9: 'BREAK'
			{
			match("BREAK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:11:7: ( 'PRINT' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:11:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:12:7: ( '^' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:12:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:13:7: ( 'calculate' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:13:9: 'calculate'
			{
			match("calculate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:7: ( 'device1:' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:14:9: 'device1:'
			{
			match("device1:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:15:7: ( 'device2:' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:15:9: 'device2:'
			{
			match("device2:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:16:7: ( 'receive from device1(' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:16:9: 'receive from device1('
			{
			match("receive from device1("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:17:7: ( 'return' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:17:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:18:7: ( 'returns' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:18:9: 'returns'
			{
			match("returns"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:19:7: ( 'send to device2(' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:19:9: 'send to device2('
			{
			match("send to device2("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:20:7: ( '{' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:20:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:21:7: ( '}' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:21:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "RECEIVE"
	public final void mRECEIVE() throws RecognitionException {
		try {
			int _type = RECEIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:153:2: ( 'receive' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:153:4: 'receive'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:157:7: ( 'true' | 'false' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:157:9: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:157:18: 'false'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:160:6: ( '&&' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:160:8: '&&'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:163:5: ( '||' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:163:7: '||'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:166:5: ( '!' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:166:7: '!'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:5: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:7: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:14: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:20: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:24: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:28: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:169:33: '>='
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:172:5: ( '*' | '/' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:175:5: ( '-' | '+' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:180:5: ( 'if' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:180:7: 'if'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:183:7: ( 'else' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:183:9: 'else'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:186:7: ( 'then' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:186:9: 'then'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:192:7: ( 'loop' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:192:9: 'loop'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:195:6: ( 'end' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:195:8: 'end'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:198:4: ( 'do' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:198:6: 'do'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:201:7: ( 'while' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:201:9: 'while'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:205:10: ( 'func' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:205:12: 'func'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:7: ( 'int' | 'float' | 'char' | 'string' | 'void' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:9: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:17: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:26: 'char'
					{
					match("char"); 

					}
					break;
				case 4 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:35: 'string'
					{
					match("string"); 

					}
					break;
				case 5 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:208:46: 'void'
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:213:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:213:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:213:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:217:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:217:7: ( '0' .. '9' )+
			{
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:217:7: ( '0' .. '9' )+
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt12=3;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:9: ( '0' .. '9' )+
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
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:25: ( '0' .. '9' )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:37: ( EXPONENT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:222:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:223:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:223:13: ( '0' .. '9' )+
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
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:223:25: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:223:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:224:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:224:9: ( '0' .. '9' )+
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
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:229:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:229:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:229:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:229:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:229:24: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:233:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:233:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:233:14: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:233:28: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:233:28: '\\r'
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:234:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:234:14: ( options {greedy=false; } : . )*
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
							// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:234:42: .
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:237:7: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:237:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:237:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:239:9: ( . )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:239:11: .
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:244:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:244:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:244:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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

			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:244:33: ( '0' .. '9' )+
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:247:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:251:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:251:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:252:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:253:9: OCTAL_ESC
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:258:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:258:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:259:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:260:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:265:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:265:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | TYPE | ID | INT | FLOAT | STRING | COMMENT | WS | ERROR )
		int alt23=44;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:106: T__49
				{
				mT__49(); 

				}
				break;
			case 18 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:112: T__50
				{
				mT__50(); 

				}
				break;
			case 19 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:118: T__51
				{
				mT__51(); 

				}
				break;
			case 20 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:124: T__52
				{
				mT__52(); 

				}
				break;
			case 21 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:130: RECEIVE
				{
				mRECEIVE(); 

				}
				break;
			case 22 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:138: BOOL
				{
				mBOOL(); 

				}
				break;
			case 23 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:143: AND
				{
				mAND(); 

				}
				break;
			case 24 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:147: OR
				{
				mOR(); 

				}
				break;
			case 25 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:150: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:154: CMP
				{
				mCMP(); 

				}
				break;
			case 27 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:158: MUL
				{
				mMUL(); 

				}
				break;
			case 28 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:162: ADD
				{
				mADD(); 

				}
				break;
			case 29 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:166: IF
				{
				mIF(); 

				}
				break;
			case 30 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:169: ELSE
				{
				mELSE(); 

				}
				break;
			case 31 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:174: THEN
				{
				mTHEN(); 

				}
				break;
			case 32 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:179: LOOP
				{
				mLOOP(); 

				}
				break;
			case 33 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:184: END
				{
				mEND(); 

				}
				break;
			case 34 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:188: DO
				{
				mDO(); 

				}
				break;
			case 35 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:191: WHILE
				{
				mWHILE(); 

				}
				break;
			case 36 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:197: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 37 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:206: TYPE
				{
				mTYPE(); 

				}
				break;
			case 38 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:211: ID
				{
				mID(); 

				}
				break;
			case 39 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:214: INT
				{
				mINT(); 

				}
				break;
			case 40 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:218: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 41 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:224: STRING
				{
				mSTRING(); 

				}
				break;
			case 42 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:231: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:239: WS
				{
				mWS(); 

				}
				break;
			case 44 :
				// C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\DualLang.g:1:242: ERROR
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
			return "221:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\4\uffff\1\52\1\uffff\1\52\1\uffff\1\57\2\61\1\uffff\4\61\2\uffff\2\61"+
		"\2\45\1\104\2\uffff\1\106\5\61\1\uffff\1\116\2\45\15\uffff\1\61\1\uffff"+
		"\1\61\1\uffff\3\61\1\130\3\61\2\uffff\5\61\5\uffff\1\142\6\61\1\uffff"+
		"\1\116\3\uffff\5\61\1\uffff\11\61\1\uffff\1\167\1\61\1\171\6\61\1\167"+
		"\5\61\1\u0085\1\u0086\1\61\1\u0088\1\61\1\uffff\1\u008a\1\uffff\1\u008b"+
		"\1\61\1\167\1\u008d\1\u008e\4\61\1\uffff\1\61\2\uffff\1\u0085\1\uffff"+
		"\1\167\2\uffff\1\u0094\2\uffff\3\61\1\u009a\1\167\1\uffff\3\61\1\u009f"+
		"\1\u00a0\1\uffff\1\61\5\uffff\1\u00a2\1\uffff";
	static final String DFA23_eofS =
		"\u00a3\uffff";
	static final String DFA23_minS =
		"\1\0\3\uffff\1\53\1\uffff\1\55\1\uffff\1\75\2\122\1\uffff\1\141\3\145"+
		"\2\uffff\1\150\1\141\1\46\1\174\1\75\2\uffff\1\52\1\146\1\154\1\157\1"+
		"\150\1\157\1\uffff\1\56\1\60\1\0\15\uffff\1\105\1\uffff\1\111\1\uffff"+
		"\1\154\1\141\1\166\1\60\1\143\1\156\1\162\2\uffff\1\165\1\145\1\154\1"+
		"\156\1\157\5\uffff\1\60\1\164\1\163\1\144\1\157\2\151\1\uffff\1\56\3\uffff"+
		"\1\101\1\116\1\143\1\162\1\151\1\uffff\1\145\1\165\1\144\1\151\1\145\1"+
		"\156\1\163\1\143\1\141\1\uffff\1\60\1\145\1\60\1\160\1\154\1\144\1\113"+
		"\1\124\1\165\1\60\1\143\1\151\1\162\1\40\1\156\2\60\1\145\1\60\1\164\1"+
		"\uffff\1\60\1\uffff\1\60\1\145\3\60\1\154\1\145\1\166\1\156\1\uffff\1"+
		"\147\2\uffff\1\60\1\uffff\1\60\2\uffff\1\60\2\uffff\1\141\1\61\1\145\2"+
		"\60\1\uffff\1\164\2\72\1\40\1\60\1\uffff\1\145\5\uffff\1\60\1\uffff";
	static final String DFA23_maxS =
		"\1\uffff\3\uffff\1\53\1\uffff\1\55\1\uffff\1\75\2\122\1\uffff\1\150\1"+
		"\157\1\145\1\164\2\uffff\1\162\1\165\1\46\1\174\1\75\2\uffff\1\57\2\156"+
		"\1\157\1\150\1\157\1\uffff\1\145\1\71\1\uffff\15\uffff\1\105\1\uffff\1"+
		"\111\1\uffff\1\154\1\141\1\166\1\172\1\164\1\156\1\162\2\uffff\1\165\1"+
		"\145\1\154\1\156\1\157\5\uffff\1\172\1\164\1\163\1\144\1\157\2\151\1\uffff"+
		"\1\145\3\uffff\1\101\1\116\1\143\1\162\1\151\1\uffff\1\145\1\165\1\144"+
		"\1\151\1\145\1\156\1\163\1\143\1\141\1\uffff\1\172\1\145\1\172\1\160\1"+
		"\154\1\144\1\113\1\124\1\165\1\172\1\143\1\151\1\162\1\40\1\156\2\172"+
		"\1\145\1\172\1\164\1\uffff\1\172\1\uffff\1\172\1\145\3\172\1\154\1\145"+
		"\1\166\1\156\1\uffff\1\147\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\2"+
		"\uffff\1\141\1\62\1\145\2\172\1\uffff\1\164\2\72\2\172\1\uffff\1\145\5"+
		"\uffff\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\uffff\1\7\3\uffff\1\13\4\uffff\1\23"+
		"\1\24\5\uffff\2\32\6\uffff\1\46\3\uffff\1\33\1\53\1\54\1\1\1\2\1\3\1\4"+
		"\1\34\1\5\1\6\1\7\1\32\1\10\1\uffff\1\46\1\uffff\1\13\7\uffff\1\23\1\24"+
		"\5\uffff\1\27\1\30\1\31\1\52\1\33\7\uffff\1\47\1\uffff\1\50\1\51\1\53"+
		"\5\uffff\1\42\11\uffff\1\35\24\uffff\1\45\1\uffff\1\41\11\uffff\1\22\1"+
		"\uffff\1\26\1\37\1\uffff\1\44\1\uffff\1\36\1\40\1\uffff\1\11\1\12\5\uffff"+
		"\1\43\5\uffff\1\20\1\uffff\1\15\1\16\1\17\1\25\1\21\1\uffff\1\14";
	static final String DFA23_specialS =
		"\1\1\41\uffff\1\0\u0080\uffff}>";
	static final String[] DFA23_transitionS = {
			"\11\45\2\44\2\45\1\44\22\45\1\44\1\26\1\42\2\45\1\1\1\24\1\45\1\2\1\3"+
			"\1\43\1\4\1\5\1\6\1\41\1\31\12\40\1\45\1\7\1\27\1\10\1\30\2\45\1\37\1"+
			"\11\15\37\1\12\12\37\3\45\1\13\1\37\1\45\2\37\1\14\1\15\1\33\1\23\2\37"+
			"\1\32\2\37\1\34\5\37\1\16\1\17\1\22\1\37\1\36\1\35\3\37\1\20\1\25\1\21"+
			"\uff82\45",
			"",
			"",
			"",
			"\1\51",
			"",
			"\1\54",
			"",
			"\1\56",
			"\1\60",
			"\1\62",
			"",
			"\1\64\6\uffff\1\65",
			"\1\66\11\uffff\1\67",
			"\1\70",
			"\1\71\16\uffff\1\72",
			"",
			"",
			"\1\76\11\uffff\1\75",
			"\1\77\12\uffff\1\101\10\uffff\1\100",
			"\1\102",
			"\1\103",
			"\1\56",
			"",
			"",
			"\1\105\4\uffff\1\105",
			"\1\107\7\uffff\1\110",
			"\1\111\1\uffff\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"\1\120\1\uffff\12\117\13\uffff\1\120\37\uffff\1\120",
			"\12\120",
			"\0\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\123",
			"",
			"\1\124",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\131\20\uffff\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"",
			"",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"",
			"\1\120\1\uffff\12\117\13\uffff\1\120\37\uffff\1\120",
			"",
			"",
			"",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\170",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0087",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0089",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u008c",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"",
			"\1\u0093",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"\1\u0095",
			"\1\u0096\1\u0097",
			"\1\u0098",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0099\7\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e\17\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u00a1",
			"",
			"",
			"",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | TYPE | ID | INT | FLOAT | STRING | COMMENT | WS | ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_34 = input.LA(1);
						s = -1;
						if ( ((LA23_34 >= '\u0000' && LA23_34 <= '\uFFFF')) ) {s = 81;}
						else s = 37;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='%') ) {s = 1;}
						else if ( (LA23_0=='(') ) {s = 2;}
						else if ( (LA23_0==')') ) {s = 3;}
						else if ( (LA23_0=='+') ) {s = 4;}
						else if ( (LA23_0==',') ) {s = 5;}
						else if ( (LA23_0=='-') ) {s = 6;}
						else if ( (LA23_0==';') ) {s = 7;}
						else if ( (LA23_0=='=') ) {s = 8;}
						else if ( (LA23_0=='B') ) {s = 9;}
						else if ( (LA23_0=='P') ) {s = 10;}
						else if ( (LA23_0=='^') ) {s = 11;}
						else if ( (LA23_0=='c') ) {s = 12;}
						else if ( (LA23_0=='d') ) {s = 13;}
						else if ( (LA23_0=='r') ) {s = 14;}
						else if ( (LA23_0=='s') ) {s = 15;}
						else if ( (LA23_0=='{') ) {s = 16;}
						else if ( (LA23_0=='}') ) {s = 17;}
						else if ( (LA23_0=='t') ) {s = 18;}
						else if ( (LA23_0=='f') ) {s = 19;}
						else if ( (LA23_0=='&') ) {s = 20;}
						else if ( (LA23_0=='|') ) {s = 21;}
						else if ( (LA23_0=='!') ) {s = 22;}
						else if ( (LA23_0=='<') ) {s = 23;}
						else if ( (LA23_0=='>') ) {s = 24;}
						else if ( (LA23_0=='/') ) {s = 25;}
						else if ( (LA23_0=='i') ) {s = 26;}
						else if ( (LA23_0=='e') ) {s = 27;}
						else if ( (LA23_0=='l') ) {s = 28;}
						else if ( (LA23_0=='w') ) {s = 29;}
						else if ( (LA23_0=='v') ) {s = 30;}
						else if ( (LA23_0=='A'||(LA23_0 >= 'C' && LA23_0 <= 'O')||(LA23_0 >= 'Q' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'b')||(LA23_0 >= 'g' && LA23_0 <= 'h')||(LA23_0 >= 'j' && LA23_0 <= 'k')||(LA23_0 >= 'm' && LA23_0 <= 'q')||LA23_0=='u'||(LA23_0 >= 'x' && LA23_0 <= 'z')) ) {s = 31;}
						else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {s = 32;}
						else if ( (LA23_0=='.') ) {s = 33;}
						else if ( (LA23_0=='\"') ) {s = 34;}
						else if ( (LA23_0=='*') ) {s = 35;}
						else if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 36;}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\b')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\u001F')||(LA23_0 >= '#' && LA23_0 <= '$')||LA23_0=='\''||LA23_0==':'||(LA23_0 >= '?' && LA23_0 <= '@')||(LA23_0 >= '[' && LA23_0 <= ']')||LA23_0=='`'||(LA23_0 >= '~' && LA23_0 <= '\uFFFF')) ) {s = 37;}
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
