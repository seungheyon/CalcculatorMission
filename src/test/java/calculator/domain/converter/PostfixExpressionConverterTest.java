package calculator.domain.converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class PostfixExpressionConverterTest {
    PostfixExpressionConverter postfixExpressionConverter = new PostfixExpressionConverter();

    @DisplayName("sut는 문자열이 주어지면 리스트로 표현된 수식으로 변환하여 반환한다")
    @Test
    void seperateOperationTest(){
        //Assert
        String operation = "3+5*2";
        List<String> expectedExpression = new ArrayList<String>(List.of("3","+","5","*","2"));

        //Act
        var actual = postfixExpressionConverter.seperateOperation(operation);

        //Assert
        assertThat(actual).isEqualTo(expectedExpression);
    }

    @DisplayName("sut는 리스트로 표현된 수식이 주어지면 후위 표기법으로 변환한 수식을 반환한다")
    @Test
    void postfixExpressionConverterTest(){
        //Assert
        List<String> infixExpression = new ArrayList<String>(List.of("3","+","5","*","2"));
        List<String> expectedExpression = new ArrayList<String>(List.of("3","5","2","*","+"));

        //Act
        var actual = postfixExpressionConverter.convertInfixToPostfix(infixExpression);

        //Assert
        assertThat(actual).isEqualTo(expectedExpression);
    }
}
