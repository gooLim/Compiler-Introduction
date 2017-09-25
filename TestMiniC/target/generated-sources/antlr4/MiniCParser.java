// Generated from MiniC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		VOID=18, INT=19, WHILE=20, IF=21, ELSE=22, RETURN=23, OR=24, AND=25, LE=26, 
		GE=27, EQ=28, NE=29, IDENT=30, LITERAL=31, DecimalConstant=32, OctalConstant=33, 
		HexadecimalConstant=34, WS=35;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_expr_stmt = 8, 
		RULE_while_stmt = 9, RULE_compound_stmt = 10, RULE_local_decl = 11, RULE_if_stmt = 12, 
		RULE_return_stmt = 13, RULE_expr = 14, RULE_args = 15;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "expr_stmt", "while_stmt", "compound_stmt", "local_decl", "if_stmt", 
		"return_stmt", "expr", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'-'", "'+'", 
		"'*'", "'/'", "'%'", "'<'", "'>'", "'!'", "'='", "'void'", "'int'", "'while'", 
		"'if'", "'else'", "'return'", "'or'", "'and'", "'<='", "'>='", "'=='", 
		"'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "VOID", "INT", "WHILE", "IF", "ELSE", 
		"RETURN", "OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", "LITERAL", "DecimalConstant", 
		"OctalConstant", "HexadecimalConstant", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				decl();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID || _la==INT );
			System.out.println("201302482 Rule 0");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				var_decl();
				System.out.println("201302482 Rule 1-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				fun_decl();
				System.out.println("201302482 Rule 1-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				type_spec();
				setState(48);
				match(IDENT);
				setState(49);
				match(T__0);
				System.out.println("201302482 Rule 2-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				type_spec();
				setState(53);
				match(IDENT);
				setState(54);
				match(T__1);
				setState(55);
				match(LITERAL);
				setState(56);
				match(T__2);
				setState(57);
				match(T__0);
				System.out.println("201302482 Rule 2-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniCParser.INT, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(VOID);
				System.out.println("201302482 Rule 3-1");
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(INT);
				System.out.println("201302482 Rule 3-2");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type_spec();
			setState(69);
			match(IDENT);
			setState(70);
			match(T__3);
			setState(71);
			params();
			setState(72);
			match(T__4);
			setState(73);
			compound_stmt();
			System.out.println("201302482 Rule 4");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				param();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(77);
					match(T__5);
					setState(78);
					param();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("201302482 Rule 5-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(VOID);
				System.out.println("201302482 Rule 5-2");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				System.out.println("201302482 Rule 5-3");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type_spec();
				setState(92);
				match(IDENT);
				System.out.println("201302482 Rule 6-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				type_spec();
				setState(96);
				match(IDENT);
				setState(97);
				match(T__1);
				setState(98);
				match(T__2);
				System.out.println("201302482 Rule 6-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case T__3:
			case T__8:
			case T__9:
			case T__15:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				expr_stmt();
				System.out.println("201302482 Rule 7-1");
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				compound_stmt();
				System.out.println("201302482 Rule 7-2");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				if_stmt();
				System.out.println("201302482 Rule 7-3");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				while_stmt();
				System.out.println("201302482 Rule 7-4");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				return_stmt();
				System.out.println("201302482 Rule 7-5");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expr(0);
			setState(121);
			match(T__0);
			System.out.println("201302482 Rule 8");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniCParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WHILE);
			setState(125);
			match(T__3);
			setState(126);
			expr(0);
			setState(127);
			match(T__4);
			setState(128);
			stmt();
			System.out.println("201302482 Rule 9");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__6);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==INT) {
				{
				{
				setState(132);
				local_decl();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(138);
				stmt();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__7);
			System.out.println("201302482 Rule 10");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_decl);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				type_spec();
				setState(148);
				match(IDENT);
				setState(149);
				match(T__0);
				System.out.println("201302482 Rule 11-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				type_spec();
				setState(153);
				match(IDENT);
				setState(154);
				match(T__1);
				setState(155);
				match(LITERAL);
				setState(156);
				match(T__2);
				setState(157);
				match(T__0);
				System.out.println("201302482 Rule 11-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniCParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniCParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(IF);
				setState(163);
				match(T__3);
				setState(164);
				expr(0);
				setState(165);
				match(T__4);
				setState(166);
				stmt();
				System.out.println("201302482 Rule 12-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(IF);
				setState(170);
				match(T__3);
				setState(171);
				expr(0);
				setState(172);
				match(T__4);
				setState(173);
				stmt();
				setState(174);
				match(ELSE);
				setState(175);
				stmt();
				System.out.println("201302482 Rule 12-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(RETURN);
				setState(181);
				match(T__0);
				System.out.println("201302482 Rule 13-1");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(RETURN);
				setState(184);
				expr(0);
				setState(185);
				match(T__0);
				System.out.println("201302482 Rule 13-2");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MiniCParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniCParser.NE, 0); }
		public TerminalNode LE() { return getToken(MiniCParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniCParser.GE, 0); }
		public TerminalNode AND() { return getToken(MiniCParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniCParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(191);
				match(LITERAL);
				System.out.println("201302482 Rule 14-1");
				}
				break;
			case 2:
				{
				setState(193);
				match(T__3);
				setState(194);
				expr(0);
				setState(195);
				match(T__4);
				System.out.println("201302482 Rule 14-2");
				}
				break;
			case 3:
				{
				setState(198);
				match(IDENT);
				System.out.println("201302482 Rule 14-3");
				}
				break;
			case 4:
				{
				setState(200);
				match(IDENT);
				setState(201);
				match(T__1);
				setState(202);
				expr(0);
				setState(203);
				match(T__2);
				System.out.println("201302482 Rule 14-4");
				}
				break;
			case 5:
				{
				setState(206);
				match(IDENT);
				setState(207);
				match(T__3);
				setState(208);
				args();
				setState(209);
				match(T__4);
				System.out.println("201302482 Rule 14-5");
				}
				break;
			case 6:
				{
				setState(212);
				match(T__8);
				setState(213);
				expr(18);
				System.out.println("201302482 Rule 14-6");
				}
				break;
			case 7:
				{
				setState(216);
				match(T__9);
				setState(217);
				expr(17);
				System.out.println("201302482 Rule 14-7");
				}
				break;
			case 8:
				{
				setState(220);
				match(T__15);
				setState(221);
				expr(5);
				System.out.println("201302482 Rule 14-19");
				}
				break;
			case 9:
				{
				setState(224);
				match(IDENT);
				setState(225);
				match(T__16);
				setState(226);
				expr(2);
				System.out.println("201302482 Rule 14-22");
				}
				break;
			case 10:
				{
				setState(229);
				match(IDENT);
				setState(230);
				match(T__1);
				setState(231);
				expr(0);
				setState(232);
				match(T__2);
				setState(233);
				match(T__16);
				setState(234);
				expr(0);
				System.out.println("201302482 Rule 14-23");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(240);
						match(T__10);
						setState(241);
						expr(17);
						System.out.println("201302482 Rule 14-8");
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(245);
						match(T__11);
						setState(246);
						expr(16);
						System.out.println("201302482 Rule 14-9");
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(250);
						match(T__12);
						setState(251);
						expr(15);
						System.out.println("201302482 Rule 14-10");
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(255);
						match(T__9);
						setState(256);
						expr(14);
						System.out.println("201302482 Rule 14-11");
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(260);
						match(T__8);
						setState(261);
						expr(13);
						System.out.println("201302482 Rule 14-12");
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(265);
						match(EQ);
						setState(266);
						expr(12);
						System.out.println("201302482 Rule 14-13");
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(270);
						match(NE);
						setState(271);
						expr(11);
						System.out.println("201302482 Rule 14-14");
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(275);
						match(LE);
						setState(276);
						expr(10);
						System.out.println("201302482 Rule 14-15");
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(280);
						match(T__13);
						setState(281);
						expr(9);
						System.out.println("201302482 Rule 14-16");
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(285);
						match(GE);
						setState(286);
						expr(8);
						System.out.println("201302482 Rule 14-17");
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(290);
						match(T__14);
						setState(291);
						expr(7);
						System.out.println("201302482 Rule 14-18");
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(295);
						match(AND);
						setState(296);
						expr(5);
						System.out.println("201302482 Rule 14-20");
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(300);
						match(OR);
						setState(301);
						expr(4);
						System.out.println("201302482 Rule 14-21");
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(320);
			switch (_input.LA(1)) {
			case T__3:
			case T__8:
			case T__9:
			case T__15:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expr(0);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(310);
					match(T__5);
					setState(311);
					expr(0);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				System.out.println("201302482 Rule 15-1");
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("201302482 Rule 15-2");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\5\5E\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7R\n\7\f\7\16\7U\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\ty\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7"+
		"\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a3"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00bf\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0133\n\20\f\20\16\20\u0136\13\20"+
		"\3\21\3\21\3\21\7\21\u013b\n\21\f\21\16\21\u013e\13\21\3\21\3\21\3\21"+
		"\5\21\u0143\n\21\3\21\2\3\36\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\2\u015d\2#\3\2\2\2\4/\3\2\2\2\6>\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\f["+
		"\3\2\2\2\16g\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24~\3\2\2\2\26\u0085\3\2"+
		"\2\2\30\u00a2\3\2\2\2\32\u00b4\3\2\2\2\34\u00be\3\2\2\2\36\u00ef\3\2\2"+
		"\2 \u0142\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2"+
		"&\'\3\2\2\2\'(\b\2\1\2(\3\3\2\2\2)*\5\6\4\2*+\b\3\1\2+\60\3\2\2\2,-\5"+
		"\n\6\2-.\b\3\1\2.\60\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\5\3\2\2\2\61\62\5"+
		"\b\5\2\62\63\7 \2\2\63\64\7\3\2\2\64\65\b\4\1\2\65?\3\2\2\2\66\67\5\b"+
		"\5\2\678\7 \2\289\7\4\2\29:\7!\2\2:;\7\5\2\2;<\7\3\2\2<=\b\4\1\2=?\3\2"+
		"\2\2>\61\3\2\2\2>\66\3\2\2\2?\7\3\2\2\2@A\7\24\2\2AE\b\5\1\2BC\7\25\2"+
		"\2CE\b\5\1\2D@\3\2\2\2DB\3\2\2\2E\t\3\2\2\2FG\5\b\5\2GH\7 \2\2HI\7\6\2"+
		"\2IJ\5\f\7\2JK\7\7\2\2KL\5\26\f\2LM\b\6\1\2M\13\3\2\2\2NS\5\16\b\2OP\7"+
		"\b\2\2PR\5\16\b\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US"+
		"\3\2\2\2VW\b\7\1\2W\\\3\2\2\2XY\7\24\2\2Y\\\b\7\1\2Z\\\b\7\1\2[N\3\2\2"+
		"\2[X\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\5\b\5\2^_\7 \2\2_`\b\b\1\2`h\3\2"+
		"\2\2ab\5\b\5\2bc\7 \2\2cd\7\4\2\2de\7\5\2\2ef\b\b\1\2fh\3\2\2\2g]\3\2"+
		"\2\2ga\3\2\2\2h\17\3\2\2\2ij\5\22\n\2jk\b\t\1\2ky\3\2\2\2lm\5\26\f\2m"+
		"n\b\t\1\2ny\3\2\2\2op\5\32\16\2pq\b\t\1\2qy\3\2\2\2rs\5\24\13\2st\b\t"+
		"\1\2ty\3\2\2\2uv\5\34\17\2vw\b\t\1\2wy\3\2\2\2xi\3\2\2\2xl\3\2\2\2xo\3"+
		"\2\2\2xr\3\2\2\2xu\3\2\2\2y\21\3\2\2\2z{\5\36\20\2{|\7\3\2\2|}\b\n\1\2"+
		"}\23\3\2\2\2~\177\7\26\2\2\177\u0080\7\6\2\2\u0080\u0081\5\36\20\2\u0081"+
		"\u0082\7\7\2\2\u0082\u0083\5\20\t\2\u0083\u0084\b\13\1\2\u0084\25\3\2"+
		"\2\2\u0085\u0089\7\t\2\2\u0086\u0088\5\30\r\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\20\t\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0094\b\f\1\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7 \2\2\u0097\u0098\7\3\2\2"+
		"\u0098\u0099\b\r\1\2\u0099\u00a3\3\2\2\2\u009a\u009b\5\b\5\2\u009b\u009c"+
		"\7 \2\2\u009c\u009d\7\4\2\2\u009d\u009e\7!\2\2\u009e\u009f\7\5\2\2\u009f"+
		"\u00a0\7\3\2\2\u00a0\u00a1\b\r\1\2\u00a1\u00a3\3\2\2\2\u00a2\u0095\3\2"+
		"\2\2\u00a2\u009a\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\5\20\t"+
		"\2\u00a9\u00aa\b\16\1\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\7\27\2\2\u00ac"+
		"\u00ad\7\6\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5"+
		"\20\t\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\b\16\1\2"+
		"\u00b3\u00b5\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b5\33"+
		"\3\2\2\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00bf\b\17\1\2"+
		"\u00b9\u00ba\7\31\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\3\2\2\u00bc"+
		"\u00bd\b\17\1\2\u00bd\u00bf\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b9\3"+
		"\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\b\20\1\2\u00c1\u00c2\7!\2\2\u00c2"+
		"\u00f0\b\20\1\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6"+
		"\7\7\2\2\u00c6\u00c7\b\20\1\2\u00c7\u00f0\3\2\2\2\u00c8\u00c9\7 \2\2\u00c9"+
		"\u00f0\b\20\1\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7\4\2\2\u00cc\u00cd\5\36"+
		"\20\2\u00cd\u00ce\7\5\2\2\u00ce\u00cf\b\20\1\2\u00cf\u00f0\3\2\2\2\u00d0"+
		"\u00d1\7 \2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\7\7"+
		"\2\2\u00d4\u00d5\b\20\1\2\u00d5\u00f0\3\2\2\2\u00d6\u00d7\7\13\2\2\u00d7"+
		"\u00d8\5\36\20\24\u00d8\u00d9\b\20\1\2\u00d9\u00f0\3\2\2\2\u00da\u00db"+
		"\7\f\2\2\u00db\u00dc\5\36\20\23\u00dc\u00dd\b\20\1\2\u00dd\u00f0\3\2\2"+
		"\2\u00de\u00df\7\22\2\2\u00df\u00e0\5\36\20\7\u00e0\u00e1\b\20\1\2\u00e1"+
		"\u00f0\3\2\2\2\u00e2\u00e3\7 \2\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\5\36"+
		"\20\4\u00e5\u00e6\b\20\1\2\u00e6\u00f0\3\2\2\2\u00e7\u00e8\7 \2\2\u00e8"+
		"\u00e9\7\4\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\7"+
		"\23\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee\b\20\1\2\u00ee\u00f0\3\2\2\2"+
		"\u00ef\u00c0\3\2\2\2\u00ef\u00c3\3\2\2\2\u00ef\u00c8\3\2\2\2\u00ef\u00ca"+
		"\3\2\2\2\u00ef\u00d0\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00da\3\2\2\2\u00ef"+
		"\u00de\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e7\3\2\2\2\u00f0\u0134\3\2"+
		"\2\2\u00f1\u00f2\f\22\2\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4\5\36\20\23\u00f4"+
		"\u00f5\b\20\1\2\u00f5\u0133\3\2\2\2\u00f6\u00f7\f\21\2\2\u00f7\u00f8\7"+
		"\16\2\2\u00f8\u00f9\5\36\20\22\u00f9\u00fa\b\20\1\2\u00fa\u0133\3\2\2"+
		"\2\u00fb\u00fc\f\20\2\2\u00fc\u00fd\7\17\2\2\u00fd\u00fe\5\36\20\21\u00fe"+
		"\u00ff\b\20\1\2\u00ff\u0133\3\2\2\2\u0100\u0101\f\17\2\2\u0101\u0102\7"+
		"\f\2\2\u0102\u0103\5\36\20\20\u0103\u0104\b\20\1\2\u0104\u0133\3\2\2\2"+
		"\u0105\u0106\f\16\2\2\u0106\u0107\7\13\2\2\u0107\u0108\5\36\20\17\u0108"+
		"\u0109\b\20\1\2\u0109\u0133\3\2\2\2\u010a\u010b\f\r\2\2\u010b\u010c\7"+
		"\36\2\2\u010c\u010d\5\36\20\16\u010d\u010e\b\20\1\2\u010e\u0133\3\2\2"+
		"\2\u010f\u0110\f\f\2\2\u0110\u0111\7\37\2\2\u0111\u0112\5\36\20\r\u0112"+
		"\u0113\b\20\1\2\u0113\u0133\3\2\2\2\u0114\u0115\f\13\2\2\u0115\u0116\7"+
		"\34\2\2\u0116\u0117\5\36\20\f\u0117\u0118\b\20\1\2\u0118\u0133\3\2\2\2"+
		"\u0119\u011a\f\n\2\2\u011a\u011b\7\20\2\2\u011b\u011c\5\36\20\13\u011c"+
		"\u011d\b\20\1\2\u011d\u0133\3\2\2\2\u011e\u011f\f\t\2\2\u011f\u0120\7"+
		"\35\2\2\u0120\u0121\5\36\20\n\u0121\u0122\b\20\1\2\u0122\u0133\3\2\2\2"+
		"\u0123\u0124\f\b\2\2\u0124\u0125\7\21\2\2\u0125\u0126\5\36\20\t\u0126"+
		"\u0127\b\20\1\2\u0127\u0133\3\2\2\2\u0128\u0129\f\6\2\2\u0129\u012a\7"+
		"\33\2\2\u012a\u012b\5\36\20\7\u012b\u012c\b\20\1\2\u012c\u0133\3\2\2\2"+
		"\u012d\u012e\f\5\2\2\u012e\u012f\7\32\2\2\u012f\u0130\5\36\20\6\u0130"+
		"\u0131\b\20\1\2\u0131\u0133\3\2\2\2\u0132\u00f1\3\2\2\2\u0132\u00f6\3"+
		"\2\2\2\u0132\u00fb\3\2\2\2\u0132\u0100\3\2\2\2\u0132\u0105\3\2\2\2\u0132"+
		"\u010a\3\2\2\2\u0132\u010f\3\2\2\2\u0132\u0114\3\2\2\2\u0132\u0119\3\2"+
		"\2\2\u0132\u011e\3\2\2\2\u0132\u0123\3\2\2\2\u0132\u0128\3\2\2\2\u0132"+
		"\u012d\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\37\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013c\5\36\20\2\u0138"+
		"\u0139\7\b\2\2\u0139\u013b\5\36\20\2\u013a\u0138\3\2\2\2\u013b\u013e\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0140\b\21\1\2\u0140\u0143\3\2\2\2\u0141\u0143\b"+
		"\21\1\2\u0142\u0137\3\2\2\2\u0142\u0141\3\2\2\2\u0143!\3\2\2\2\24%/>D"+
		"S[gx\u0089\u008f\u00a2\u00b4\u00be\u00ef\u0132\u0134\u013c\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}