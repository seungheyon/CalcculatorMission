package calculator.domain.converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixExpressionConverterTest {
    PostfixExpressionConverter postfixExpressionConverter = new PostfixExpressionConverter();

    @DisplayName("sut는 문자열이 주어지면 리스트로 표현된 수식으로 변환하여 반환한다")
    @Test
    void seperateOperationTest(){
        //Assert
        String operation = "3 + 14 - 2 * 5";
        List<String> expectedExpression = new ArrayList<String>(List.of("3","+","14","-","2","*","5"));

        //Act
        var actual = postfixExpressionConverter.seperateOperation(operation);

        //Assert
        assertThat(actual).isEqualTo(expectedExpression);
    }

    @DisplayName("sut는 리스트로 표현된 수식이 주어지면 후위 표기법으로 변환한 수식을 반환한다")
    @Test
    void postfixExpressionConverterTest(){
        //Assert
        List<String> infixExpression1 = new ArrayList<String>(List.of("3","+","5","*","2"));
        List<String> expectedExpression1 = new ArrayList<String>(List.of("3","5","2","*","+"));

        List<String> infixExpression2 = new ArrayList<String>(List.of("3","*","5","+","2"));
        List<String> expectedExpression2 = new ArrayList<String>(List.of("3","5","*","2","+"));

        List<String> infixExpression3 = new ArrayList<String>(List.of("3","+","14","-","2","*","5"));
        List<String> expectedExpression3 = new ArrayList<String>(List.of("3","14","+","2","5","*","-"));



        //Act
        var actual1 = postfixExpressionConverter.convertInfixToPostfix(infixExpression1);
        var actual2 = postfixExpressionConverter.convertInfixToPostfix(infixExpression2);
        var actual3 = postfixExpressionConverter.convertInfixToPostfix(infixExpression3);


        //Assert
        assertThat(actual1).isEqualTo(expectedExpression1);
        assertThat(actual2).isEqualTo(expectedExpression2);
        assertThat(actual3).isEqualTo(expectedExpression3);

    }
}
