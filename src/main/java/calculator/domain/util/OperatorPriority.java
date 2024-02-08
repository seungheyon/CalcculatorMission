package calculator.domain.util;

import calculator.domain.Operand;
import calculator.domain.Operator;
import calculator.domain.constants.OperatorEnum;

public class OperatorPriority {

    public static int operatorPriority(String operator){
        switch (operator){
            case "+" :
                return OperatorEnum.Operator.ADDITION.getPriority();
            case "-" :
                return OperatorEnum.Operator.SUBTRACTION.getPriority();
            case "*" :
                return OperatorEnum.Operator.MULTIPLICATION.getPriority();
            case "/" :
                return OperatorEnum.Operator.DIVISION.getPriority();
            default:
                return 0;
        }
    }
}
