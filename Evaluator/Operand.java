package Evaluator;

public class Operand {

    public int operandValue;

    public Operand(String token) {
        operandValue = Integer.parseInt(token);

    }

    public Operand(int value) {
        operandValue = value;

    }

    public int getValue() {
        return operandValue;
    }

    public static boolean check(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
