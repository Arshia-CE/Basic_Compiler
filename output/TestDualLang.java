import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

public class TestDualLang {
    public static void main(String[] args) throws Exception {
        DualLangLexer lexer = new DualLangLexer(new ANTLRStringStream("&& or ee 3je3"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DualLangParser parser = new DualLangParser(tokens);

        try {
            Token token;
            while ((token = lexer.nextToken()) != null && token.getType() != Token.EOF) {
                System.out.println("Token: " + lexer.getRuleNames()[token.getType() - 1] + " -> '" + token.getText() + "'");
            }
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
