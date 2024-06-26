/* A Bison parser, made by GNU Bison 3.8.2.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2021 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <https://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */




import java.text.MessageFormat;
import java.util.ArrayList;
/* "%code imports" blocks.  */
/* "morpho.y":5  */

	import java.util.*;

/* "morpho.java":48  */

/**
 * A Bison parser, automatically generated from <tt>morpho.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class NanoMorphoParser extends Compiler
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.8.2";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";



  /**
   * True if verbose error messages are enabled.
   */
  private boolean yyErrorVerbose = true;

  /**
   * Whether verbose error messages are enabled.
   */
  public final boolean getErrorVerbose() { return yyErrorVerbose; }

  /**
   * Set the verbosity of error messages.
   * @param verbose True to request verbose error messages.
   */
  public final void setErrorVerbose(boolean verbose)
  { yyErrorVerbose = verbose; }




  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_WHILE(3),                    /* WHILE  */
    S_IF(4),                       /* IF  */
    S_ELSE(5),                     /* ELSE  */
    S_VAR(6),                      /* VAR  */
    S_NAME(7),                     /* NAME  */
    S_LITERAL(8),                  /* LITERAL  */
    S_OP1(9),                      /* OP1  */
    S_OP2(10),                     /* OP2  */
    S_OP3(11),                     /* OP3  */
    S_OP4(12),                     /* OP4  */
    S_OP5(13),                     /* OP5  */
    S_OP6(14),                     /* OP6  */
    S_OP7(15),                     /* OP7  */
    S_RETURN(16),                  /* RETURN  */
    S_17_(17),                     /* '='  */
    S_OR(18),                      /* OR  */
    S_AND(19),                     /* AND  */
    S_NOT(20),                     /* NOT  */
    S_UNOP(21),                    /* UNOP  */
    S_22_(22),                     /* '('  */
    S_23_(23),                     /* ')'  */
    S_24_(24),                     /* '{'  */
    S_25_(25),                     /* '}'  */
    S_26_(26),                     /* ','  */
    S_27_(27),                     /* ';'  */
    S_YYACCEPT(28),                /* $accept  */
    S_start(29),                   /* start  */
    S_program(30),                 /* program  */
    S_varcount(31),                /* varcount  */
    S_function(32),                /* function  */
    S_33_1(33),                    /* $@1  */
    S_optnames(34),                /* optnames  */
    S_names(35),                   /* names  */
    S_expr(36),                    /* expr  */
    S_exprs(37),                   /* exprs  */
    S_op(38),                      /* op  */
    S_ifexpr(39),                  /* ifexpr  */
    S_body(40),                    /* body  */
    S_decls(41),                   /* decls  */
    S_decl(42),                    /* decl  */
    S_args(43),                    /* args  */
    S_optargs(44);                 /* optargs  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_WHILE,
      SymbolKind.S_IF,
      SymbolKind.S_ELSE,
      SymbolKind.S_VAR,
      SymbolKind.S_NAME,
      SymbolKind.S_LITERAL,
      SymbolKind.S_OP1,
      SymbolKind.S_OP2,
      SymbolKind.S_OP3,
      SymbolKind.S_OP4,
      SymbolKind.S_OP5,
      SymbolKind.S_OP6,
      SymbolKind.S_OP7,
      SymbolKind.S_RETURN,
      SymbolKind.S_17_,
      SymbolKind.S_OR,
      SymbolKind.S_AND,
      SymbolKind.S_NOT,
      SymbolKind.S_UNOP,
      SymbolKind.S_22_,
      SymbolKind.S_23_,
      SymbolKind.S_24_,
      SymbolKind.S_25_,
      SymbolKind.S_26_,
      SymbolKind.S_27_,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_start,
      SymbolKind.S_program,
      SymbolKind.S_varcount,
      SymbolKind.S_function,
      SymbolKind.S_33_1,
      SymbolKind.S_optnames,
      SymbolKind.S_names,
      SymbolKind.S_expr,
      SymbolKind.S_exprs,
      SymbolKind.S_op,
      SymbolKind.S_ifexpr,
      SymbolKind.S_body,
      SymbolKind.S_decls,
      SymbolKind.S_decl,
      SymbolKind.S_args,
      SymbolKind.S_optargs
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* Return YYSTR after stripping away unnecessary quotes and
       backslashes, so that it's suitable for yyerror.  The heuristic is
       that double-quoting is unnecessary unless the string contains an
       apostrophe, a comma, or backslash (other than backslash-backslash).
       YYSTR is taken from yytname.  */
    private static String yytnamerr_(String yystr)
    {
      if (yystr.charAt (0) == '"')
        {
          StringBuffer yyr = new StringBuffer();
          strip_quotes: for (int i = 1; i < yystr.length(); i++)
            switch (yystr.charAt(i))
              {
              case '\'':
              case ',':
                break strip_quotes;

              case '\\':
                if (yystr.charAt(++i) != '\\')
                  break strip_quotes;
                /* Fall through.  */
              default:
                yyr.append(yystr.charAt(i));
                break;

              case '"':
                return yyr.toString();
              }
        }
      return yystr;
    }

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yytname_ = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "\"end of file\"", "error", "\"invalid token\"", "WHILE", "IF", "ELSE",
  "VAR", "NAME", "LITERAL", "OP1", "OP2", "OP3", "OP4", "OP5", "OP6",
  "OP7", "RETURN", "'='", "OR", "AND", "NOT", "UNOP", "'('", "')'", "'{'",
  "'}'", "','", "';'", "$accept", "start", "program", "varcount",
  "function", "$@1", "optnames", "names", "expr", "exprs", "op", "ifexpr",
  "body", "decls", "decl", "args", "optargs", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yytnamerr_(yytname_[yycode_]);
    }

  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>NanoMorphoParser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token WHILE, to be returned by the scanner.  */
    static final int WHILE = 258;
    /** Token IF, to be returned by the scanner.  */
    static final int IF = 259;
    /** Token ELSE, to be returned by the scanner.  */
    static final int ELSE = 260;
    /** Token VAR, to be returned by the scanner.  */
    static final int VAR = 261;
    /** Token NAME, to be returned by the scanner.  */
    static final int NAME = 262;
    /** Token LITERAL, to be returned by the scanner.  */
    static final int LITERAL = 263;
    /** Token OP1, to be returned by the scanner.  */
    static final int OP1 = 264;
    /** Token OP2, to be returned by the scanner.  */
    static final int OP2 = 265;
    /** Token OP3, to be returned by the scanner.  */
    static final int OP3 = 266;
    /** Token OP4, to be returned by the scanner.  */
    static final int OP4 = 267;
    /** Token OP5, to be returned by the scanner.  */
    static final int OP5 = 268;
    /** Token OP6, to be returned by the scanner.  */
    static final int OP6 = 269;
    /** Token OP7, to be returned by the scanner.  */
    static final int OP7 = 270;
    /** Token RETURN, to be returned by the scanner.  */
    static final int RETURN = 271;
    /** Token OR, to be returned by the scanner.  */
    static final int OR = 272;
    /** Token AND, to be returned by the scanner.  */
    static final int AND = 273;
    /** Token NOT, to be returned by the scanner.  */
    static final int NOT = 274;
    /** Token UNOP, to be returned by the scanner.  */
    static final int UNOP = 275;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an errorin a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
     void yyerror(String msg);


  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public NanoMorphoParser(Lexer yylexer)
  {

    this.yylexer = yylexer;

  }



  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors() { return yynerrs; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror(msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push(int state, Object value) {
      height++;
      if (size == height) {
        int[] newStateStack = new int[size * 2];
        System.arraycopy(stateStack, 0, newStateStack, 0, height);
        stateStack = newStateStack;

        Object[] newValueStack = new Object[size * 2];
        System.arraycopy(valueStack, 0, newValueStack, 0, height);
        valueStack = newValueStack;

        size *= 2;
      }

      stateStack[height] = state;
      valueStack[height] = value;
    }

    public final void pop() {
      pop(1);
    }

    public final void pop(int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill(valueStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt(int i) {
      return stateStack[height - i];
    }

    public final Object valueAt(int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print(java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++) {
        out.print(' ');
        out.print(stateStack[i]);
      }
      out.println();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState(int yystate, int yysym) {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen)
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Object yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);

    switch (yyn)
      {
          case 2: /* start: program  */
  if (yyn == 2)
    /* "morpho.y":39  */
                { generateProgram(((Vector<Object[]>)(yystack.valueAt (0)))); };
  break;


  case 3: /* program: program function  */
  if (yyn == 3)
    /* "morpho.y":43  */
                                        { ((Vector<Object[]>)((Vector<Object[]>)(yystack.valueAt (1)))).add(((Object[])(yystack.valueAt (0)))); yyval = ((Vector<Object[]>)(yystack.valueAt (1))); };
  break;


  case 4: /* program: function  */
  if (yyn == 4)
    /* "morpho.y":44  */
                                                { yyval = new Vector<Object[]>(); ((Vector<Object[]>)yyval).add(((Object[])(yystack.valueAt (0)))); };
  break;


  case 5: /* varcount: %empty  */
  if (yyn == 5)
    /* "morpho.y":48  */
                       { yyval = varCount; };
  break;


  case 6: /* $@1: %empty  */
  if (yyn == 6)
    /* "morpho.y":53  */
                { varTable = new HashMap<String,Integer>();	varCount=0; };
  break;


  case 7: /* function: NAME '(' $@1 optnames ')' varcount '{' decls exprs '}'  */
  if (yyn == 7)
    /* "morpho.y":57  */
                { yyval = new Object[]{((String)(yystack.valueAt (9))),((Integer)(yystack.valueAt (4))),varCount-((Integer)(yystack.valueAt (4))),((Vector<Object[]>)(yystack.valueAt (1)))}; };
  break;


  case 10: /* names: names ',' NAME  */
  if (yyn == 10)
    /* "morpho.y":66  */
                               { addVar (((String)(yystack.valueAt (0)))); };
  break;


  case 11: /* names: NAME  */
  if (yyn == 11)
    /* "morpho.y":67  */
                     { addVar (((String)(yystack.valueAt (0)))); };
  break;


  case 12: /* expr: RETURN expr  */
  if (yyn == 12)
    /* "morpho.y":71  */
                                                { yyval = new Object[]{"RETURN", ((Object[])(yystack.valueAt (0)))}; };
  break;


  case 13: /* expr: NAME '=' expr  */
  if (yyn == 13)
    /* "morpho.y":72  */
                                                { yyval = new Object[]{"STORE",findVar(((String)(yystack.valueAt (2)))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 14: /* expr: expr OR expr  */
  if (yyn == 14)
    /* "morpho.y":73  */
                                                { yyval = new Object[]{"OR",((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 15: /* expr: expr AND expr  */
  if (yyn == 15)
    /* "morpho.y":74  */
                                                { yyval = new Object[]{"AND",((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 16: /* expr: NOT expr  */
  if (yyn == 16)
    /* "morpho.y":75  */
                                                        { yyval = new Object[]{"NOT",((Object[])(yystack.valueAt (0)))}; };
  break;


  case 17: /* expr: expr OP1 expr  */
  if (yyn == 17)
    /* "morpho.y":76  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 18: /* expr: expr OP2 expr  */
  if (yyn == 18)
    /* "morpho.y":77  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 19: /* expr: expr OP3 expr  */
  if (yyn == 19)
    /* "morpho.y":78  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 20: /* expr: expr OP4 expr  */
  if (yyn == 20)
    /* "morpho.y":79  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 21: /* expr: expr OP5 expr  */
  if (yyn == 21)
    /* "morpho.y":80  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 22: /* expr: expr OP6 expr  */
  if (yyn == 22)
    /* "morpho.y":81  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 23: /* expr: expr OP7 expr  */
  if (yyn == 23)
    /* "morpho.y":82  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 24: /* expr: ifexpr  */
  if (yyn == 24)
    /* "morpho.y":83  */
                                                        { yyval = ((Object[])(yystack.valueAt (0))); };
  break;


  case 25: /* expr: WHILE expr body  */
  if (yyn == 25)
    /* "morpho.y":84  */
                                                { yyval = new Object[]{"WHILE",((Object[])(yystack.valueAt (1))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 26: /* expr: op expr  */
  if (yyn == 26)
    /* "morpho.y":85  */
                                                { yyval = new Object[]{"CALL",((String)(yystack.valueAt (1))),new Object[]{((Object[])(yystack.valueAt (0)))}}; };
  break;


  case 27: /* expr: NAME  */
  if (yyn == 27)
    /* "morpho.y":86  */
                                                        { yyval = new Object[]{"FETCH",findVar(((String)(yystack.valueAt (0))))}; };
  break;


  case 28: /* expr: NAME '(' optargs ')'  */
  if (yyn == 28)
    /* "morpho.y":87  */
                                        { yyval = new Object[]{"CALL",((String)(yystack.valueAt (3))),((Vector<Object[]>)(yystack.valueAt (1))).toArray()}; };
  break;


  case 29: /* expr: LITERAL  */
  if (yyn == 29)
    /* "morpho.y":88  */
                                                        { yyval = new Object[]{"LITERAL",((String)(yystack.valueAt (0)))}; };
  break;


  case 30: /* expr: '(' expr ')'  */
  if (yyn == 30)
    /* "morpho.y":89  */
                                                { yyval = ((Object[])(yystack.valueAt (1)));};
  break;


  case 31: /* exprs: exprs expr ';'  */
  if (yyn == 31)
    /* "morpho.y":93  */
                                { yyval = ((Vector<Object[]>)(yystack.valueAt (2))); ((Vector<Object[]>)yyval).add(((Object[])(yystack.valueAt (1)))); };
  break;


  case 32: /* exprs: expr ';'  */
  if (yyn == 32)
    /* "morpho.y":94  */
                                { yyval = new Vector<Object[]>(); ((Vector<Object[]>)yyval).add(((Object[])(yystack.valueAt (1)))); };
  break;


  case 40: /* ifexpr: IF expr body  */
  if (yyn == 40)
    /* "morpho.y":102  */
                                                        { yyval = new Object[]{"IF1",((Object[])(yystack.valueAt (1))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 41: /* ifexpr: IF expr body ELSE body  */
  if (yyn == 41)
    /* "morpho.y":103  */
                                                { yyval = new Object[]{"IF2",((Object[])(yystack.valueAt (3))),((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 42: /* ifexpr: IF expr body ELSE ifexpr  */
  if (yyn == 42)
    /* "morpho.y":104  */
                                                { yyval = new Object[]{"IF2",((Object[])(yystack.valueAt (3))),((Object[])(yystack.valueAt (2))),((Object[])(yystack.valueAt (0)))}; };
  break;


  case 43: /* body: '{' exprs '}'  */
  if (yyn == 43)
    /* "morpho.y":108  */
                                { yyval = new Object[]{"BODY",((Vector<Object[]>)(yystack.valueAt (1)))}; };
  break;


  case 47: /* args: args ',' expr  */
  if (yyn == 47)
    /* "morpho.y":121  */
                                { ((Vector<Object[]>)yyval).add(((Object[])(yystack.valueAt (0)))); };
  break;


  case 48: /* args: expr  */
  if (yyn == 48)
    /* "morpho.y":122  */
                        { yyval = new Vector<Object[]>(); ((Vector<Object[]>)yyval).add(((Object[])(yystack.valueAt (0)))); };
  break;


  case 50: /* optargs: %empty  */
  if (yyn == 50)
    /* "morpho.y":127  */
                       { yyval = new Vector<Object[]>(); };
  break;



/* "morpho.java":750  */

        default: break;
      }

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval);
    return YYNEWSTATE;
  }




  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException

  {


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;



    /* Semantic value of the lookahead.  */
    Object yylval = null;



    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode()) {
              label = YYDEFAULT;
            }

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError(yyn)) {
                  label = YYERRLAB;
                } else {
                  yyn = -yyn;
                  label = YYREDUCE;
                }
              }

            else
              {
                /* Shift the lookahead token.  */
                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push(yystate, yylval);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt(0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError(new Context(this, yystack, yytoken));
          }

        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt(0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt(0);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context {
    Context(NanoMorphoParser parser, YYStack stack, SymbolKind token) {
      yyparser = parser;
      yystack = stack;
      yytoken = token;
    }

    private NanoMorphoParser yyparser;
    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken() {
      return yytoken;
    }

    private SymbolKind yytoken;
    static final int NTOKENS = NanoMorphoParser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens(SymbolKind yyarg[], int yyargn) {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens(SymbolKind yyarg[], int yyoffset, int yyargn) {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt(0)];
      if (!yyPactValueIsDefault(yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }




  private int yysyntaxErrorArguments(Context yyctx, SymbolKind[] yyarg, int yyargn) {
    /* There are many possibilities here to consider:
       - If this state is a consistent state with a default action,
         then the only way this function was invoked is if the
         default action is an error action.  In that case, don't
         check for expected tokens because there are none.
       - The only way there can be no lookahead present (in tok) is
         if this state is a consistent state with a default action.
         Thus, detecting the absence of a lookahead is sufficient to
         determine that there is no unexpected or expected token to
         report.  In that case, just report a simple "syntax error".
       - Don't assume there isn't a lookahead just because this
         state is a consistent state with a default action.  There
         might have been a previous inconsistent state, consistent
         state with a non-default action, or user semantic action
         that manipulated yychar.  (However, yychar is currently out
         of scope during semantic actions.)
       - Of course, the expected token list depends on states to
         have correct lookahead information, and it depends on the
         parser not to perform extra reductions after fetching a
         lookahead from the scanner and before detecting a syntax
         error.  Thus, state merging (from LALR or IELR) and default
         reductions corrupt the expected token list.  However, the
         list is correct for canonical LR with one exception: it
         will still contain any token that will not be accepted due
         to an error action in a later state.
    */
    int yycount = 0;
    if (yyctx.getToken() != null)
      {
        if (yyarg != null)
          yyarg[yycount] = yyctx.getToken();
        yycount += 1;
        yycount += yyctx.getExpectedTokens(yyarg, 1, yyargn);
      }
    return yycount;
  }


  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      if (yyErrorVerbose) {
          final int argmax = 5;
          SymbolKind[] yyarg = new SymbolKind[argmax];
          int yycount = yysyntaxErrorArguments(yyctx, yyarg, argmax);
          String[] yystr = new String[yycount];
          for (int yyi = 0; yyi < yycount; ++yyi) {
              yystr[yyi] = yyarg[yyi].getName();
          }
          String yyformat;
          switch (yycount) {
              default:
              case 0: yyformat = "syntax error"; break;
              case 1: yyformat = "syntax error, unexpected {0}"; break;
              case 2: yyformat = "syntax error, unexpected {0}, expecting {1}"; break;
              case 3: yyformat = "syntax error, unexpected {0}, expecting {1} or {2}"; break;
              case 4: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3}"; break;
              case 5: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3} or {4}"; break;
          }
          yyerror(new MessageFormat(yyformat).format(yystr));
      } else {
          yyerror("syntax error");
      }
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault(int yyvalue) {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError(int yyvalue) {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -38;
  private static final byte yytable_ninf_ = -1;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      11,    -3,    21,    11,   -38,   -38,   -38,   -38,    15,   -38,
       3,    12,   -38,    20,    13,   -38,   -38,    80,   100,   100,
      15,    -2,   -38,   -38,   -38,   -38,   -38,   -38,   -38,   -38,
     100,   100,   100,   114,    36,   100,   -38,    14,   136,   136,
      12,   100,   100,   167,   189,   152,   100,   100,   100,   100,
     100,   100,   100,   100,   100,   -38,   -38,   125,   -38,   -38,
     100,   -38,    52,   167,   167,    33,    42,   -38,    -4,    -4,
     144,    40,   -11,    51,   -38,   167,   178,   -38,    60,     1,
     100,   -38,   -38,   -38,   -38,   167
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte[] yydefact_ = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       0,     0,     0,     2,     4,     6,     1,     3,     9,    11,
       0,     8,     5,     0,     0,    10,    45,     0,     0,     0,
       0,    27,    29,    33,    34,    35,    36,    37,    38,    39,
       0,     0,     0,     0,     0,     0,    24,     0,     0,     0,
      46,     0,    50,    12,    16,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    32,     7,     0,    26,    44,
       0,    25,    40,    13,    48,    49,     0,    30,    17,    18,
      19,    20,    21,    22,    23,    14,    15,    31,     0,     0,
       0,    28,    43,    42,    41,    47
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte[] yypgoto_ = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -38,   -38,   -38,   -38,    74,   -38,   -38,    58,   -18,    19,
     -38,     2,   -37,   -38,   -38,   -38,   -38
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte[] yydefgoto_ = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
       0,     2,     3,    14,     4,     8,    10,    11,    33,    34,
      35,    36,    61,    17,    37,    65,    66
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte[] yytable_ = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
    {
      38,    39,    62,    51,    52,    19,    47,    48,    49,    50,
      51,    52,    43,    44,    45,    41,    57,    58,     1,     5,
      42,     6,     9,    63,    64,    60,    12,    15,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    16,    13,    18,
      19,    59,    84,    21,    22,    23,    24,    25,    26,    27,
      28,    29,    30,    50,    51,    52,    31,    79,    32,    80,
      57,    56,    85,    18,    19,    81,    52,    21,    22,    23,
      24,    25,    26,    27,    28,    29,    30,     7,    40,    78,
      31,    83,    32,    18,    19,    82,    20,    21,    22,    23,
      24,    25,    26,    27,    28,    29,    30,     0,     0,     0,
      31,     0,    32,    18,    19,     0,     0,    21,    22,    23,
      24,    25,    26,    27,    28,    29,    30,     0,     0,     0,
      31,     0,    32,    46,    47,    48,    49,    50,    51,    52,
       0,     0,    53,    54,    46,    47,    48,    49,    50,    51,
      52,    55,     0,    53,    54,    46,    47,    48,    49,    50,
      51,    52,    77,     0,    53,    54,    49,    50,    51,    52,
      60,    46,    47,    48,    49,    50,    51,    52,     0,     0,
      53,    54,     0,     0,     0,    67,    46,    47,    48,    49,
      50,    51,    52,     0,     0,    53,    54,    46,    47,    48,
      49,    50,    51,    52,     0,     0,     0,    54,    46,    47,
      48,    49,    50,    51,    52
    };
  }

private static final byte[] yycheck_ = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
      18,    19,    39,    14,    15,     4,    10,    11,    12,    13,
      14,    15,    30,    31,    32,    17,    34,    35,     7,    22,
      22,     0,     7,    41,    42,    24,    23,     7,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    24,    26,     3,
       4,    27,    79,     7,     8,     9,    10,    11,    12,    13,
      14,    15,    16,    13,    14,    15,    20,     5,    22,    26,
      78,    25,    80,     3,     4,    23,    15,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,     3,    20,    60,
      20,    79,    22,     3,     4,    25,     6,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    -1,    -1,    -1,
      20,    -1,    22,     3,     4,    -1,    -1,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    16,    -1,    -1,    -1,
      20,    -1,    22,     9,    10,    11,    12,    13,    14,    15,
      -1,    -1,    18,    19,     9,    10,    11,    12,    13,    14,
      15,    27,    -1,    18,    19,     9,    10,    11,    12,    13,
      14,    15,    27,    -1,    18,    19,    12,    13,    14,    15,
      24,     9,    10,    11,    12,    13,    14,    15,    -1,    -1,
      18,    19,    -1,    -1,    -1,    23,     9,    10,    11,    12,
      13,    14,    15,    -1,    -1,    18,    19,     9,    10,    11,
      12,    13,    14,    15,    -1,    -1,    -1,    19,     9,    10,
      11,    12,    13,    14,    15
    };
  }

/* YYSTOS[STATE-NUM] -- The symbol kind of the accessing symbol of
   state STATE-NUM.  */
  private static final byte[] yystos_ = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,     7,    29,    30,    32,    22,     0,    32,    33,     7,
      34,    35,    23,    26,    31,     7,    24,    41,     3,     4,
       6,     7,     8,     9,    10,    11,    12,    13,    14,    15,
      16,    20,    22,    36,    37,    38,    39,    42,    36,    36,
      35,    17,    22,    36,    36,    36,     9,    10,    11,    12,
      13,    14,    15,    18,    19,    27,    25,    36,    36,    27,
      24,    40,    40,    36,    36,    43,    44,    23,    36,    36,
      36,    36,    36,    36,    36,    36,    36,    27,    37,     5,
      26,    23,    25,    39,    40,    36
    };
  }

/* YYR1[RULE-NUM] -- Symbol kind of the left-hand side of rule RULE-NUM.  */
  private static final byte[] yyr1_ = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    28,    29,    30,    30,    31,    33,    32,    34,    34,
      35,    35,    36,    36,    36,    36,    36,    36,    36,    36,
      36,    36,    36,    36,    36,    36,    36,    36,    36,    36,
      36,    37,    37,    38,    38,    38,    38,    38,    38,    38,
      39,    39,    39,    40,    41,    41,    42,    43,    43,    44,
      44
    };
  }

/* YYR2[RULE-NUM] -- Number of symbols on the right-hand side of rule RULE-NUM.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     2,     1,     0,     0,    10,     1,     0,
       3,     1,     2,     3,     3,     3,     2,     3,     3,     3,
       3,     3,     3,     3,     1,     3,     2,     1,     4,     1,
       3,     3,     2,     1,     1,     1,     1,     1,     1,     1,
       3,     5,     5,     3,     3,     0,     2,     3,     1,     1,
       0
    };
  }




  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 275;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
      22,    23,     2,     2,    26,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,    27,
       2,    17,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    24,     2,    25,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    18,    19,    20,    21
    };
  }


  private static final int YYLAST_ = 204;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 6;
  private static final int YYNTOKENS_ = 28;


}
/* "morpho.y":130  */

