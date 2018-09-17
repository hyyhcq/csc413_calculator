package operators;

import Evaluator.Operand;
import java.util.*;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );

    static HashMap operators = new HashMap();
    static{
        operators.put( "+", new AdditionOperator() );
        operators.put( "-", new SubtractionOperator() );
        operators.put( "*", new MultiplicationOperator() );
        operators.put( "/", new DivisionOperator() );
        operators.put( "^", new PowerOperator() );
        operators.put( "(", new LeftParOperator() );
        operators.put("@", new StartOperator());
    }

    public static Operator getOperator(String token) {
        return (Operator) Operator.operators.get(token);
    }



    public abstract int priority();

    public abstract Operand execute(Operand op1, Operand op2);

    public static boolean check(String token) {
        //return operators.containsKey(token);
        return token.equals("+")|| token.equals("-")||token.equals("*") ||
                token.equals("/")||token.equals("^")||token.equals("(")||token.equals(")");

    }
}
