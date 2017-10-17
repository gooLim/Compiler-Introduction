import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
public class PrettyPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MiniCLexer lexer = new MiniCLexer(new ANTLRFileStream("test"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniCParser parser = new MiniCParser(tokens);
		ParseTree tree = parser.program();
		
		System.out.println(new MiniCPrintVisitor().visit(tree));
	}

}
