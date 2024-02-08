package calculator.domain.util;

import calculator.domain.operators.*;

public class OperatorFactory {
    public static Operators createOperator(String operator){
        switch (operator){
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                return null;
        }
    }
}
