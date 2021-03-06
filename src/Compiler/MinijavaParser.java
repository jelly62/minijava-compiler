// Generated from Minijava.g4 by ANTLR 4.7.2

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinijavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, ID=35, INT=36, OP=37, COMMENT_LINE=38, COMMENT=39, 
		WS=40;
	public static final int
		RULE_prog = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"type", "statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
			"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'.length'", "'.'", "'true'", "'false'", "'this'", "'new'", "'!'", 
			"'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "OP", "COMMENT_LINE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Minijava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		//error detections
		//
		public static boolean isKeyWord(String id)
		{
			List<String> keys = new ArrayList<String>();
			keys.add("int");
			keys.add("void");
			keys.add("if");
			keys.add("while");
			keys.add("else");
			keys.add("default");
			keys.add("private");
			keys.add("extends");
			keys.add("class");
			keys.add("return");
			keys.add("true");
			keys.add("false");
			return keys.contains(id);
			
		}

	public MinijavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MinijavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinijavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinijavaParser.ID, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			match(ID);
			setState(27);
			match(T__1);
			setState(28);
			match(T__2);
			setState(29);
			match(T__3);
			setState(30);
			match(T__4);
			setState(31);
			match(T__5);
			setState(32);
			match(T__6);
			setState(33);
			match(T__7);
			setState(34);
			match(T__8);
			setState(35);
			match(T__9);
			setState(36);
			match(ID);
			setState(37);
			match(T__10);
			setState(38);
			match(T__1);
			setState(39);
			statement();
			setState(40);
			match(T__11);
			setState(41);
			match(T__11);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinijavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinijavaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(45);
				match(T__12);
				setState(46);
				match(ID);
				}
			}

			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				varDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				methodDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__11);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(ID);
			setState(66);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MinijavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinijavaParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			type();
			setState(70);
			match(ID);
			setState(71);
			match(T__6);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(72);
				type();
				setState(73);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(74);
					match(T__14);
					setState(75);
					type();
					setState(76);
					match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(T__10);
			setState(86);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					varDeclaration();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__15);
			setState(100);
			expr(0);
			setState(101);
			match(T__13);
			setState(102);
			match(T__11);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__16);
				setState(105);
				match(T__8);
				setState(106);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__1);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__18);
				setState(121);
				match(T__6);
				setState(122);
				expr(0);
				setState(123);
				match(T__10);
				setState(124);
				statement();
				setState(125);
				match(T__19);
				setState(126);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__20);
				setState(129);
				match(T__6);
				setState(130);
				expr(0);
				setState(131);
				match(T__10);
				setState(132);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__21);
				setState(135);
				match(T__6);
				setState(136);
				expr(0);
				setState(137);
				match(T__10);
				setState(138);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(ID);
				setState(141);
				match(T__22);
				setState(142);
				expr(0);
				setState(143);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__8);
				setState(147);
				expr(0);
				setState(148);
				match(T__9);
				setState(149);
				match(T__22);
				setState(150);
				expr(0);
				setState(151);
				match(T__13);
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
		public Token ID;
		public TerminalNode INT() { return getToken(MinijavaParser.INT, 0); }
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(MinijavaParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinijavaListener ) ((MinijavaListener)listener).exitExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				match(INT);
				}
				break;
			case 2:
				{
				setState(157);
				match(T__25);
				}
				break;
			case 3:
				{
				setState(158);
				match(T__26);
				}
				break;
			case 4:
				{
				setState(159);
				((ExprContext)_localctx).ID = match(ID);

						String var_name = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
						if(MinijavaParser.isKeyWord(var_name)) 
						{
							System.out.println("error: keword: " +var_name + " is used as an ID "+ " at " +(((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getLine():0) + ":"+(((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getCharPositionInLine():0));
						}		
						
				}
				break;
			case 5:
				{
				setState(161);
				match(T__27);
				}
				break;
			case 6:
				{
				setState(162);
				match(T__28);
				setState(163);
				match(T__16);
				setState(164);
				match(T__8);
				setState(165);
				expr(0);
				setState(166);
				match(T__9);
				}
				break;
			case 7:
				{
				setState(168);
				match(T__28);
				setState(169);
				((ExprContext)_localctx).ID = match(ID);
				setState(170);
				match(T__6);
				setState(171);
				match(T__10);
				}
				break;
			case 8:
				{
				setState(172);
				match(T__29);
				setState(173);
				expr(6);
				}
				break;
			case 9:
				{
				setState(174);
				match(T__6);
				setState(175);
				expr(0);
				setState(176);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(181);
						match(OP);
						setState(182);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(184);
						match(T__30);
						setState(185);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(187);
						match(T__31);
						setState(188);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(190);
						match(T__32);
						setState(191);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(193);
						match(T__33);
						setState(194);
						expr(2);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(196);
						match(T__8);
						setState(197);
						expr(0);
						setState(198);
						match(T__9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(201);
						match(T__23);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(203);
						match(T__24);
						setState(204);
						((ExprContext)_localctx).ID = match(ID);
						setState(205);
						match(T__6);
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(206);
							expr(0);
							setState(211);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(207);
								match(T__14);
								setState(208);
								expr(0);
								}
								}
								setState(213);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(216);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(221);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6"+
		"\5\6V\n\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\7\bu\n"+
		"\b\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d4\n\t\f\t\16\t\u00d7"+
		"\13\t\5\t\u00d9\n\t\3\t\7\t\u00dc\n\t\f\t\16\t\u00df\13\t\3\t\2\3\20\n"+
		"\2\4\6\b\n\f\16\20\2\2\2\u00fb\2\22\3\2\2\2\4\33\3\2\2\2\6-\3\2\2\2\b"+
		"B\3\2\2\2\nF\3\2\2\2\fp\3\2\2\2\16\u009b\3\2\2\2\20\u00b4\3\2\2\2\22\26"+
		"\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34"+
		"\7\3\2\2\34\35\7%\2\2\35\36\7\4\2\2\36\37\7\5\2\2\37 \7\6\2\2 !\7\7\2"+
		"\2!\"\7\b\2\2\"#\7\t\2\2#$\7\n\2\2$%\7\13\2\2%&\7\f\2\2&\'\7%\2\2\'(\7"+
		"\r\2\2()\7\4\2\2)*\5\16\b\2*+\7\16\2\2+,\7\16\2\2,\5\3\2\2\2-.\7\3\2\2"+
		".\61\7%\2\2/\60\7\17\2\2\60\62\7%\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63"+
		"\3\2\2\2\63\67\7\4\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\16\2\2A\7\3\2\2\2BC\5\f\7"+
		"\2CD\7%\2\2DE\7\20\2\2E\t\3\2\2\2FG\7\5\2\2GH\5\f\7\2HI\7%\2\2IU\7\t\2"+
		"\2JK\5\f\7\2KR\7%\2\2LM\7\21\2\2MN\5\f\7\2NO\7%\2\2OQ\3\2\2\2PL\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UJ\3\2\2\2UV\3\2\2"+
		"\2VW\3\2\2\2WX\7\r\2\2X\\\7\4\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\22\2\2fg\5\20\t\2gh\7\20\2"+
		"\2hi\7\16\2\2i\13\3\2\2\2jk\7\23\2\2kl\7\13\2\2lq\7\f\2\2mq\7\24\2\2n"+
		"q\7\23\2\2oq\7%\2\2pj\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2"+
		"rv\7\4\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2y\u009c\7\16\2\2z{\7\25\2\2{|\7\t\2\2|}\5\20\t\2}~\7\r\2\2"+
		"~\177\5\16\b\2\177\u0080\7\26\2\2\u0080\u0081\5\16\b\2\u0081\u009c\3\2"+
		"\2\2\u0082\u0083\7\27\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5\20\t\2\u0085"+
		"\u0086\7\r\2\2\u0086\u0087\5\16\b\2\u0087\u009c\3\2\2\2\u0088\u0089\7"+
		"\30\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\r\2\2\u008c"+
		"\u008d\7\20\2\2\u008d\u009c\3\2\2\2\u008e\u008f\7%\2\2\u008f\u0090\7\31"+
		"\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\20\2\2\u0092\u009c\3\2\2\2\u0093"+
		"\u0094\7%\2\2\u0094\u0095\7\13\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7"+
		"\f\2\2\u0097\u0098\7\31\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\20\2\2"+
		"\u009a\u009c\3\2\2\2\u009br\3\2\2\2\u009bz\3\2\2\2\u009b\u0082\3\2\2\2"+
		"\u009b\u0088\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0093\3\2\2\2\u009c\17"+
		"\3\2\2\2\u009d\u009e\b\t\1\2\u009e\u00b5\7&\2\2\u009f\u00b5\7\34\2\2\u00a0"+
		"\u00b5\7\35\2\2\u00a1\u00a2\7%\2\2\u00a2\u00b5\b\t\1\2\u00a3\u00b5\7\36"+
		"\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\u00a8\5\20\t\2\u00a8\u00a9\7\f\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab\7"+
		"\37\2\2\u00ab\u00ac\7%\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00b5\7\r\2\2\u00ae"+
		"\u00af\7 \2\2\u00af\u00b5\5\20\t\b\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\20"+
		"\t\2\u00b2\u00b3\7\r\2\2\u00b3\u00b5\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4"+
		"\u009f\3\2\2\2\u00b4\u00a0\3\2\2\2\u00b4\u00a1\3\2\2\2\u00b4\u00a3\3\2"+
		"\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b5\u00dd\3\2\2\2\u00b6\u00b7\f\23\2\2\u00b7\u00b8\7"+
		"\'\2\2\u00b8\u00dc\5\20\t\24\u00b9\u00ba\f\6\2\2\u00ba\u00bb\7!\2\2\u00bb"+
		"\u00dc\5\20\t\7\u00bc\u00bd\f\5\2\2\u00bd\u00be\7\"\2\2\u00be\u00dc\5"+
		"\20\t\6\u00bf\u00c0\f\4\2\2\u00c0\u00c1\7#\2\2\u00c1\u00dc\5\20\t\5\u00c2"+
		"\u00c3\f\3\2\2\u00c3\u00c4\7$\2\2\u00c4\u00dc\5\20\t\4\u00c5\u00c6\f\22"+
		"\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9\7\f\2\2\u00c9"+
		"\u00dc\3\2\2\2\u00ca\u00cb\f\21\2\2\u00cb\u00dc\7\32\2\2\u00cc\u00cd\f"+
		"\20\2\2\u00cd\u00ce\7\33\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d8\7\t\2\2\u00d0"+
		"\u00d5\5\20\t\2\u00d1\u00d2\7\21\2\2\u00d2\u00d4\5\20\t\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\r\2\2\u00db\u00b6\3\2\2\2\u00db"+
		"\u00b9\3\2\2\2\u00db\u00bc\3\2\2\2\u00db\u00bf\3\2\2\2\u00db\u00c2\3\2"+
		"\2\2\u00db\u00c5\3\2\2\2\u00db\u00ca\3\2\2\2\u00db\u00cc\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\21\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\22\26\61\67=RU\\bpv\u009b\u00b4\u00d5\u00d8\u00db"+
		"\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}