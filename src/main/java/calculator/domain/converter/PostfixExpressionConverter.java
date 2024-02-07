package calculator.domain.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixExpressionConverter {

    List<String> seperateOperation(String operation){
        return new ArrayList<String>(List.of(" "));
    }

    Stack<String> convertInfixToPostfix(List<String> infixExpression){
        return  new Stack<>();
    }
}
