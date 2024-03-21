import java.io.*;
import java.util.*;

public class Compiler
{
    static String filename = null;
    static NanoMorphoLexer lexer = null;

    static public void main( String[] args ) throws Exception
    {
        Vector<Object[]> code = null;
        try
        {
            filename = args[0];
            lexer = new NanoMorphoLexer(new FileReader(filename));
            NanoMorphoParser parser = new NanoMorphoParser(lexer);
            parser.parse();
        }
        catch( Throwable e )
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    public static HashMap<String,Integer> varTable = null;
    public static int varCount = 0;
    
    public static void addVar( String name )
    {
        if( varTable.get(name) != null )
            lexer.yyerror("expected undeclared variable name, found "+name);
        varTable.put(name,varCount++);
    }

    public static int findVar( String name )
    {
        Integer res = varTable.get(name);
        if( res == null )
            lexer.yyerror("expected declared variable name, found "+name);
        return res;
    }

    static void emit( String fmt, Object... args )
    {
        System.out.format(fmt,args);
        System.out.println();
    }
    
    public static void generateProgram( Vector<Object[]> funs )
    {
        String programname = filename.substring(0,filename.lastIndexOf('.'));
        emit("\"%s.mexe\" = main in",programname);
        emit("!");
        emit("{{");
        for( Object[] f: funs ) generateFunction(f);
        emit("}}");
        emit("*");
        emit("BASIS;");
    }
    
    static void generateFunction( Object[] fun )
    {
        emit("#\"%s[f%d]\" = ", (String) fun[0], (Integer) fun[1]);
        emit("[");
        if ((Integer) fun[2] != 0) {
            emit("(MakeVal null)");
            for (int i=0; i< (Integer) fun[2]; i++)
                emit("(Push)");
        }
        for (Object f: (Object[]) fun[3])
            generateExpr((Object[]) f);
        emit("(Return)");
        emit("];");
    }
    
    // All existing labels, i.e. labels in the generated
    // code that we have already produced, should be
    // of form
    //    _xxxx
    // where xxxx corresponds to an integer n
    // such that 0 <= n < nextLab.
    // So we should update nextLab as we generate
    // new labels.
    // The first generated label would be _0, the
    // next would be _1, and so on.
    private static int nextLab = 0;
    
    // Returns a new, previously unused, label.
    // Useful for control-flow expressions.
    static String newLabel()
    {
        return "_"+(nextLab++);
    }

    static void generateBody(Object[] bod){
        Object[] exprsArray = (Object[]) bod[1];
        Vector<Object[]> exprs = new Vector<>();
        for(Object expr: exprsArray){
            exprs.add((Object[]) expr);
        }
        for(Object[] expr: exprs){
            generateExpr(expr);
        }
    }
    
    static void generateExpr(Object[] e) {
        String type = (String) e[0];
        if ("CALL".equals(type)) {
            Object[] argsArray = (Object[]) e[2];
            Vector<Object[]> expressions = new Vector<>();
            for (Object arg : argsArray) {
                expressions.add((Object[]) arg);
            }
            for (int i = 0; i < expressions.size(); i++) {
                generateExpr(expressions.get(i));
                if (i < expressions.size() - 1) {
                    emit(("Push"));
                }
            }
            emit("(Call #\"%s[f%d]\" %d)",
                (String) e[1], expressions.size(),
                expressions.size());
        } else if ("FETCH".equals(type)) {
            emit("(Fetch %d)", (Integer) e[1]);
        } else if ("STORE".equals(type)) {
            generateExpr((Object[]) e[2]);
            emit("(Store %d)", (Integer) e[1]);
        } else if ("LITERAL".equals(type)) {
            emit("(MakeVal %s)", (String) e[1]);
        } else if ("RETURN".equals(type)) {
            generateExpr((Object[]) e[1]);
            emit("(Return)");
        } else if ("IF1".equals(type)) {
            String endLab = newLabel();
            generateExpr((Object[]) e[1]);
            emit("(GoFalse %s)", endLab);
            generateExpr((Object[]) e[2]);
            emit("%s:", endLab);
        } else if ("IF2".equals(type)) {
            String elseLab = newLabel();
            String endLab = newLabel();
            generateExpr((Object[]) e[1]);
            emit("(GoFalse %s)", elseLab);
            generateExpr((Object[]) e[2]);
            emit("(Go %s)", endLab);
            emit("%s:", elseLab);
            generateExpr((Object[]) e[3]);
            emit("%s:", endLab);
        } else if ("WHILE".equals(type)) {
            String startLab = newLabel();
            String endLab = newLabel();
            emit("%s:", startLab);
            generateExpr((Object[]) e[1]);
            emit("(GoFalse %s)", endLab);
            generateExpr((Object[]) e[2]);
            emit("(Go %s)", startLab);
            emit("%s:", endLab);
        } else if ("BODY".equals(type)) {
            generateBody(e);
        }
    }
}