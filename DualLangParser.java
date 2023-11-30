// $ANTLR 3.5.3 DualLang.g 2023-11-30 21:08:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DualLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "BOOL", "CMP", "COMMENT", 
		"DO", "ELSE", "END", "ERROR", "ESC_SEQ", "EXPONENT", "FLOAT", "FUNCTION", 
		"HEX_DIGIT", "ID", "IF", "INT", "LOOP", "MUL", "NOT", "OCTAL_ESC", "OR", 
		"RECEIVE", "SEND", "STRING", "THEN", "TYPE", "UNICODE_ESC", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DualLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DualLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DualLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "DualLang.g"; }



	// $ANTLR start "prog"
	// DualLang.g:4:1: prog : statements EOF ;
	public final void prog() throws RecognitionException {
		try {
			// DualLang.g:5:5: ( statements EOF )
			// DualLang.g:5:7: statements EOF
			{
			pushFollow(FOLLOW_statements_in_prog16);
			statements();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_prog18); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "statements"
	// DualLang.g:8:1: statements : ( statement )* ;
	public final void statements() throws RecognitionException {
		try {
			// DualLang.g:9:5: ( ( statement )* )
			// DualLang.g:9:7: ( statement )*
			{
			// DualLang.g:9:7: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ADD && LA1_0 <= ERROR)||(LA1_0 >= FLOAT && LA1_0 <= FUNCTION)||(LA1_0 >= ID && LA1_0 <= NOT)||(LA1_0 >= OR && LA1_0 <= TYPE)||(LA1_0 >= WHILE && LA1_0 <= WS)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// DualLang.g:9:7: statement
					{
					pushFollow(FOLLOW_statement_in_statements35);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
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
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// DualLang.g:12:1: statement : ( SEND | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | ID | TYPE | INT | FLOAT | STRING | COMMENT | ERROR | WS );
	public final void statement() throws RecognitionException {
		try {
			// DualLang.g:12:10: ( SEND | RECEIVE | BOOL | AND | OR | NOT | CMP | MUL | ADD | IF | ELSE | THEN | LOOP | END | DO | WHILE | FUNCTION | ID | TYPE | INT | FLOAT | STRING | COMMENT | ERROR | WS )
			// DualLang.g:
			{
			if ( (input.LA(1) >= ADD && input.LA(1) <= ERROR)||(input.LA(1) >= FLOAT && input.LA(1) <= FUNCTION)||(input.LA(1) >= ID && input.LA(1) <= NOT)||(input.LA(1) >= OR && input.LA(1) <= TYPE)||(input.LA(1) >= WHILE && input.LA(1) <= WS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
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
	}
	// $ANTLR end "statement"

	// Delegated rules



	public static final BitSet FOLLOW_statements_in_prog16 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog18 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements35 = new BitSet(new long[]{0x000000037EFD9FF2L});
}
