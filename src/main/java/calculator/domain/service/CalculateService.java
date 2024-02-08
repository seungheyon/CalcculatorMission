package calculator.domain.service;

import calculator.domain.operators.Operators;
import calculator.domain.util.OperatorFactory;

import java.util.List;
import java.util.Stack;

public class CalculateService {

    public Double calculatePostfixExpression(List<String> postfixExpression){

        Stack<Double> operandStack = new Stack<>();

        for(String term : postfixExpression){
            try{
                Double operand = Double.parseDouble(term);
                operandStack.push(operand);
            } catch (NumberFormatException e){
                Operators operator = OperatorFactory.createOperator(term);
                Double operand2 = operandStack.pop();
                Double operand1 = operandStack.pop();
                Double median = operator.operate(operand1, operand2);
                operandStack.push(median);
            }
        }



        return operandStack.pop();
    }
}
