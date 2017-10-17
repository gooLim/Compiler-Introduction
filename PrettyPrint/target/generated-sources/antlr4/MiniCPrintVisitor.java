public class MiniCPrintVisitor extends MiniCBaseVisitor<String> {
	static final String INDENTSTR = "....";
	static int indentNum = 0;
	static boolean isbracket = false;
	
	private String indent() {
		String str = "";
		for (int i = 0; i < indentNum; i++) {
			str += INDENTSTR;
		}
		return str;
	}

	@Override
	public String visitProgram(MiniCParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			str += visit(ctx.getChild(i));
		}
		return str;
	}

	@Override
	public String visitDecl(MiniCParser.DeclContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDecl(ctx);
	}

	@Override
	public String visitVar_decl(MiniCParser.Var_declContext ctx) {
		// TODO Auto-generated method stub
		String result = "";
		String type = visit(ctx.type_spec());
		String ident = ctx.getChild(1).getText();
		String literal;
		if (ctx.getChildCount() == 3) {
			result = ident + ";";
		} else if (ctx.getChildCount() == 5) {
			literal = ctx.getChild(3).getText();
			result = ident + " = " + literal + ";";
		} else if (ctx.getChildCount() == 6) {
			literal = ctx.getChild(3).getText();
			result = ident + "[" + literal + "];";
		}

		return type + " " + result + "\n";
	}

	@Override
	public String visitType_spec(MiniCParser.Type_specContext ctx) {
		// TODO Auto-generated method stub
		return indent() + ctx.getText();
	}

	@Override
	public String visitFun_decl(MiniCParser.Fun_declContext ctx) {
		// TODO Auto-generated method stub
		String type = visit(ctx.type_spec());
		String ident = ctx.getChild(1).getText();
		String param = visit(ctx.params());
		String compound = visit(ctx.getChild(5));
		return type + " " + ident + "(" + param + ")\n" + compound + "\n";
	}

	@Override
	public String visitParams(MiniCParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		String str = "";
		if (ctx.getChildCount() == 0) {
			return str;
		} else if (ctx.getChildCount() == 1
				&& ctx.getChild(0).getText().equals("void")) {
			str = "void";
		} else {
			int count = 0;
			for (int i = 0; i < ctx.getChildCount(); i++) {
				if (ctx.getChild(i).getText().equals(",")) {
					str += ", ";
					count++;
				} else {
					str += visit(ctx.param(i - count));
				}
			}
		}
		return str;
	}

	@Override
	public String visitParam(MiniCParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		String str = "";
		if (ctx.getChildCount() == 2) {
			str = visit(ctx.type_spec()) + " " + ctx.getChild(1).getText();
		} else if (ctx.getChildCount() == 4) {
			str = visit(ctx.type_spec()) + " " + ctx.getChild(1).getText()
					+ "[]";
		}
		return str;
	}

	@Override
	public String visitStmt(MiniCParser.StmtContext ctx) {
		// TODO Auto-generated method stub
		return visitChildren(ctx);
	}

	@Override
	public String visitExpr_stmt(MiniCParser.Expr_stmtContext ctx) {
		// TODO Auto-generated method stub
		String str = visit(ctx.expr());
		return str + ";\n";
	}

	@Override
	public String visitWhile_stmt(MiniCParser.While_stmtContext ctx) {
		// TODO Auto-generated method stub
		String str = "while ";
		isbracket = true;
		String expr = visit(ctx.expr());
		isbracket = false;
		String stmt = "";
		str += "(" + expr + ")\n";
		if (ctx.stmt().compound_stmt() == null) {
			str = str + indent() + "{\n";
			indentNum++;
			stmt = visit(ctx.stmt());
			indentNum--;
			str += stmt + indent() + "}\n";
		} else {
			stmt = visit(ctx.stmt());
			str += stmt + "\n";
		}
		return indent() + str;
	}

	@Override
	public String visitCompound_stmt(MiniCParser.Compound_stmtContext ctx) {
		// TODO Auto-generated method stub
		String str = indent() + "{\n";
		indentNum++;
		for (int i = 1; i < ctx.getChildCount() - 1; i++) {
			str += visit(ctx.getChild(i));
		}
		indentNum--;
		return str + indent() + "}";

	}

	@Override
	public String visitLocal_decl(MiniCParser.Local_declContext ctx) {
		// TODO Auto-generated method stub
		String result = "";
		String type = ctx.type_spec().getText();
		String ident = ctx.getChild(1).getText();
		String literal;
		if (ctx.getChildCount() == 3) {
			result = ident + ";";
		} else if (ctx.getChildCount() == 5) {
			literal = ctx.getChild(3).getText();
			result = ident + " = " + literal + ";";
		} else if (ctx.getChildCount() == 6) {
			literal = ctx.getChild(3).getText();
			result = ident + "[" + literal + "];";
		}

		return indent() + type + " " + result + "\n";
	}

	@Override
	public String visitIf_stmt(MiniCParser.If_stmtContext ctx) {
		// TODO Auto-generated method stub
		String str = "if ";
		String stmt = "";
		if (ctx.stmt(0).compound_stmt() == null) {
			isbracket = true;
			str = str + "(" + visit(ctx.expr()) + ")\n" + indent() + "{\n";
			isbracket = false;
			indentNum++;
			stmt = visit(ctx.stmt(0));
			indentNum--;
			str += stmt + indent() + "}\n";
		} else {
			stmt = visit(ctx.stmt(0));
			isbracket = true;
			str += "(" + visit(ctx.expr()) + ")\n" + stmt + "\n";
			isbracket = false;
		}
		if(ctx.stmt(1) != null){
			if(ctx.stmt(1).compound_stmt() == null){
				str +=indent()+"else\n"+indent()+"{\n";
				indentNum++;
				stmt = visit(ctx.stmt(1));
				indentNum--;
				str += stmt + indent() + "}\n";
			}
			else{
				str += indent()+"else\n"+ visit(ctx.stmt(1))+"\n";
			}
		}
		return indent() + str;
	}

	@Override
	public String visitReturn_stmt(MiniCParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		String str = "";
		if (ctx.getChildCount() == 2) {
			str = "return ;";
		} else if (ctx.getChildCount() == 3) {
			str = "return " + visit(ctx.expr()) + ";";
		}
		return indent() + str + "\n";
	}

	boolean isBinaryOperation(MiniCParser.ExprContext ctx) {
		return ctx.getChildCount() == 3 && ctx.getChild(1) != ctx.expr(0);
	}

	@Override
	public String visitExpr(MiniCParser.ExprContext ctx) {
		// TODO Auto-generated method stub
		String s1 = null, s2 = null, op = null;
		if (ctx.getChildCount() == 1) {
			return ctx.getChild(0).getText();
		} else if (ctx.getChildCount() == 2) {
			s1 = visit(ctx.expr(0));
			op = ctx.getChild(0).getText();
			return (isbracket ? "" : indent()) + op + s1;
		} else if (ctx.getChildCount() == 4) {
			boolean temp = isbracket;
			s1 = ctx.getChild(0).getText();
//			return (isbracket ? "" : indent()) + s1 + (ctx.getChild(1).getText().equals("[") ? "[" + s2 + "]" : "(" + s2 + ")");
			if (ctx.getChild(1).getText().equals("[")) {
				s2 = visit(ctx.expr(0));
				return (isbracket ? "" : indent()) + s1 + "[" + s2 + "]";
			} else {
				s2 = visit(ctx.args());
				isbracket = temp;
				return (isbracket ? "" : indent()) + s1 + "(" + s2 + ")";
			}
		} else if (ctx.getChildCount() == 6) {
			boolean temp = isbracket;
			isbracket = true;
			String s3 = visit(ctx.expr(1));
			isbracket = temp;
			s1 = ctx.getChild(0).getText();
			s2 = visit(ctx.expr(0));
			return (isbracket ? "" : indent()) + s1 + "[" + s2 + "] = " + s3;
		}
		if (ctx.getChild(1).getText().equals("=")) {
			s1 = ctx.getChild(0).getText();
			boolean temp = isbracket;
			isbracket = true;
			s2 = visit(ctx.expr(0));
			isbracket = false;
			op = ctx.getChild(1).getText();
			return indent() + s1 + " " + op + " " + s2;
		} else if (isBinaryOperation(ctx)) {
			s1 = visit(ctx.expr(0));
			boolean temp = isbracket;
			isbracket = true;
			s2 = visit(ctx.expr(1));
			isbracket = temp;
			op = ctx.getChild(1).getText();
			return s1 + " " + op + " " + s2;
		} else {
			isbracket = true;
			String str = "(" + visit(ctx.expr(0)) + ")";
			isbracket = false;
			return str;
		}
	}

	@Override
	public String visitArgs(MiniCParser.ArgsContext ctx) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {			
			str += ctx.getChild(i).getText().equals(",") ? ", " : visit(ctx.getChild(i)); 
		}
		return str;
	}
}
