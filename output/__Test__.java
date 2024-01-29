import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        DualLangLexer lex = new DualLangLexer(new ANTLRFileStream("C:\\Users\\user\\Desktop\\University\\Sem4021\\Compiler Design\\Antlr\\Basic_Compiler\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        DualLangParser g = new DualLangParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}