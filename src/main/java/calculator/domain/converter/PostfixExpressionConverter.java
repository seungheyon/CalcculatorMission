package calculator.domain.converter;

import calculator.domain.Operand;
import calculator.domain.Operator;
import calculator.domain.util.OperatorPriority;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixExpressionConverter {

    public List<String> seperateOperation(String operation){
        return List.of(operation.split("\\s+"));
    }

    public List<String> convertInfixToPostfix(List<String> infixExpression){

        List<String> postfixExpression = new ArrayList<>();
        Stack<String> operatorStack = new Stack<>();

        for(String term : infixExpression){
            try{
                Operand operand = new Operand(term);
                postfixExpression.add(term);
            }
            catch (NumberFormatException numberFormatException){
                try{
                    Operator operator = new Operator(term);
                    if(operatorStack.isEmpty()|| OperatorPriority.operatorPriority(operatorStack.peek())<OperatorPriority.operatorPriority(operator.getSymbol())){
                        operatorStack.push(operator.getSymbol());
                        continue;
                    }
                    while(!operatorStack.isEmpty()&&OperatorPriority.operatorPriority(operatorStack.peek())>=OperatorPriority.operatorPriority(operator.getSymbol())){
                        postfixExpression.add(operatorStack.pop());
                    }
                    operatorStack.push(operator.getSymbol());
                }
                catch (IllegalArgumentException illegalArgumentException){
                    throw new IllegalArgumentException(illegalArgumentException.getMessage());
                }
            }
        }

        while (!operatorStack.isEmpty()){
            postfixExpression.add(operatorStack.pop());
        }

        return  postfixExpression;
    }
}
