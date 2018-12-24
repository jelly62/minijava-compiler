// Generated from Minijava.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, ID=31, INT=32, OP=33, 
		COMMENT_LINE=34, COMMENT=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'new'", "'true'", "'return'", "'class'", "'while'", 
		"';'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", "'int'", "'.length'", 
		"'('", "'this'", "','", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "']'", "'public'", "'!'", "'static'", "'else'", "')'", 
		"ID", "INT", "OP", "COMMENT_LINE", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expr = 7;
	public static final String[] ruleNames = {
		"prog", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Minijava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinijavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(MinijavaParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
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
			setState(16); mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(17); classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(EOF);
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
			setState(25); match(T__25);
			setState(26); match(ID);
			setState(27); match(T__21);
			setState(28); match(T__4);
			setState(29); match(T__2);
			setState(30); match(T__22);
			setState(31); match(T__29);
			setState(32); match(T__14);
			setState(33); match(T__6);
			setState(34); match(T__7);
			setState(35); match(T__5);
			setState(36); match(ID);
			setState(37); match(T__0);
			setState(38); match(T__21);
			setState(39); statement();
			setState(40); match(T__18);
			setState(41); match(T__18);
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(MinijavaParser.ID, i);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
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
			setState(43); match(T__25);
			setState(44); match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(45); match(T__19);
				setState(46); match(ID);
				}
			}

			setState(49); match(T__21);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(50); varDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(56); methodDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); match(T__18);
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
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(64); type();
			setState(65); match(ID);
			setState(66); match(T__23);
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
		public List<TerminalNode> ID() { return getTokens(MinijavaParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(MinijavaParser.ID, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
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
			setState(68); match(T__4);
			setState(69); type();
			setState(70); match(ID);
			setState(71); match(T__14);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				setState(72); type();
				setState(73); match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(74); match(T__12);
					setState(75); type();
					setState(76); match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(T__0);
			setState(86); match(T__21);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87); varDeclaration();
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__17) | (1L << T__8) | (1L << ID))) != 0)) {
				{
				{
				setState(93); statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(T__26);
			setState(100); expr(0);
			setState(101); match(T__23);
			setState(102); match(T__18);
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
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(T__16);
				setState(105); match(T__7);
				setState(106); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); match(ID);
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
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
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
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(T__21);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__21) | (1L << T__17) | (1L << T__8) | (1L << ID))) != 0)) {
					{
					{
					setState(113); statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119); match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(T__17);
				setState(121); match(T__14);
				setState(122); expr(0);
				setState(123); match(T__0);
				setState(124); statement();
				setState(125); match(T__1);
				setState(126); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(T__24);
				setState(129); match(T__14);
				setState(130); expr(0);
				setState(131); match(T__0);
				setState(132); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(T__8);
				setState(135); match(T__14);
				setState(136); expr(0);
				setState(137); match(T__0);
				setState(138); match(T__23);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); match(ID);
				setState(141); match(T__20);
				setState(142); expr(0);
				setState(143); match(T__23);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); match(ID);
				setState(146); match(T__7);
				setState(147); expr(0);
				setState(148); match(T__5);
				setState(149); match(T__20);
				setState(150); expr(0);
				setState(151); match(T__23);
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
		public TerminalNode ID() { return getToken(MinijavaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode OP() { return getToken(MinijavaParser.OP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(MinijavaParser.INT, 0); }
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
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156); match(T__3);
				setState(157); expr(2);
				}
				break;
			case 2:
				{
				setState(158); match(INT);
				}
				break;
			case 3:
				{
				setState(159); match(T__27);
				}
				break;
			case 4:
				{
				setState(160); match(T__11);
				}
				break;
			case 5:
				{
				setState(161); match(ID);
				}
				break;
			case 6:
				{
				setState(162); match(T__13);
				}
				break;
			case 7:
				{
				setState(163); match(T__28);
				setState(164); match(T__16);
				setState(165); match(T__7);
				setState(166); expr(0);
				setState(167); match(T__5);
				}
				break;
			case 8:
				{
				setState(169); match(T__28);
				setState(170); match(ID);
				setState(171); match(T__14);
				setState(172); match(T__0);
				}
				break;
			case 9:
				{
				setState(173); match(T__14);
				setState(174); expr(0);
				setState(175); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180); match(OP);
						setState(181); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183); match(T__7);
						setState(184); expr(0);
						setState(185); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188); match(T__15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190); match(T__10);
						setState(191); match(ID);
						setState(192); match(T__14);
						setState(201);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__27) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__3) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(193); expr(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(194); match(T__12);
								setState(195); expr(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203); match(T__0);
						}
						break;
					}
					} 
				}
				setState(208);
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
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00d4\4\2\t\2\4"+
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
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n"+
		"\t\f\t\16\t\u00ca\13\t\5\t\u00cc\n\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2"+
		"\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\2\u00ea\2\22\3\2\2\2\4\33\3\2\2"+
		"\2\6-\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fp\3\2\2\2\16\u009b\3\2\2\2\20\u00b3"+
		"\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3"+
		"\3\2\2\2\33\34\7\7\2\2\34\35\7!\2\2\35\36\7\13\2\2\36\37\7\34\2\2\37 "+
		"\7\36\2\2 !\7\n\2\2!\"\7\3\2\2\"#\7\22\2\2#$\7\32\2\2$%\7\31\2\2%&\7\33"+
		"\2\2&\'\7!\2\2\'(\7 \2\2()\7\13\2\2)*\5\16\b\2*+\7\16\2\2+,\7\16\2\2,"+
		"\5\3\2\2\2-.\7\7\2\2.\61\7!\2\2/\60\7\r\2\2\60\62\7!\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\3\2\2\2\63\67\7\13\2\2\64\66\5\b\5\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\n\6\2;:"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\16\2\2"+
		"A\7\3\2\2\2BC\5\f\7\2CD\7!\2\2DE\7\t\2\2E\t\3\2\2\2FG\7\34\2\2GH\5\f\7"+
		"\2HI\7!\2\2IU\7\22\2\2JK\5\f\7\2KR\7!\2\2LM\7\24\2\2MN\5\f\7\2NO\7!\2"+
		"\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2UJ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7 \2\2X\\\7\13\2\2Y[\5\b\5\2ZY\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\16\b\2`"+
		"_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\6\2\2"+
		"fg\5\20\t\2gh\7\t\2\2hi\7\16\2\2i\13\3\2\2\2jk\7\20\2\2kl\7\31\2\2lq\7"+
		"\33\2\2mq\7\27\2\2nq\7\20\2\2oq\7!\2\2pj\3\2\2\2pm\3\2\2\2pn\3\2\2\2p"+
		"o\3\2\2\2q\r\3\2\2\2rv\7\13\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u009c\7\16\2\2z{\7\17\2\2{|\7\22\2\2"+
		"|}\5\20\t\2}~\7 \2\2~\177\5\16\b\2\177\u0080\7\37\2\2\u0080\u0081\5\16"+
		"\b\2\u0081\u009c\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0085\5\20\t\2\u0085\u0086\7 \2\2\u0086\u0087\5\16\b\2\u0087\u009c\3"+
		"\2\2\2\u0088\u0089\7\30\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\20\t\2"+
		"\u008b\u008c\7 \2\2\u008c\u008d\7\t\2\2\u008d\u009c\3\2\2\2\u008e\u008f"+
		"\7!\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\t\2\2\u0092"+
		"\u009c\3\2\2\2\u0093\u0094\7!\2\2\u0094\u0095\7\31\2\2\u0095\u0096\5\20"+
		"\t\2\u0096\u0097\7\33\2\2\u0097\u0098\7\f\2\2\u0098\u0099\5\20\t\2\u0099"+
		"\u009a\7\t\2\2\u009a\u009c\3\2\2\2\u009br\3\2\2\2\u009bz\3\2\2\2\u009b"+
		"\u0082\3\2\2\2\u009b\u0088\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0093\3\2"+
		"\2\2\u009c\17\3\2\2\2\u009d\u009e\b\t\1\2\u009e\u009f\7\35\2\2\u009f\u00b4"+
		"\5\20\t\4\u00a0\u00b4\7\"\2\2\u00a1\u00b4\7\5\2\2\u00a2\u00b4\7\25\2\2"+
		"\u00a3\u00b4\7!\2\2\u00a4\u00b4\7\23\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7"+
		"\7\20\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\33\2"+
		"\2\u00aa\u00b4\3\2\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\7!\2\2\u00ad\u00ae"+
		"\7\22\2\2\u00ae\u00b4\7 \2\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\5\20\t\2"+
		"\u00b1\u00b2\7 \2\2\u00b2\u00b4\3\2\2\2\u00b3\u009d\3\2\2\2\u00b3\u00a0"+
		"\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3"+
		"\u00a4\3\2\2\2\u00b3\u00a5\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af\3\2"+
		"\2\2\u00b4\u00d0\3\2\2\2\u00b5\u00b6\f\17\2\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00cf\5\20\t\20\u00b8\u00b9\f\16\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb"+
		"\5\20\t\2\u00bb\u00bc\7\33\2\2\u00bc\u00cf\3\2\2\2\u00bd\u00be\f\r\2\2"+
		"\u00be\u00cf\7\21\2\2\u00bf\u00c0\f\f\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00c2"+
		"\7!\2\2\u00c2\u00cb\7\22\2\2\u00c3\u00c8\5\20\t\2\u00c4\u00c5\7\24\2\2"+
		"\u00c5\u00c7\5\20\t\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7 "+
		"\2\2\u00ce\u00b5\3\2\2\2\u00ce\u00b8\3\2\2\2\u00ce\u00bd\3\2\2\2\u00ce"+
		"\u00bf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\21\3\2\2\2\u00d2\u00d0\3\2\2\2\22\26\61\67=RU\\bpv\u009b\u00b3"+
		"\u00c8\u00cb\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}