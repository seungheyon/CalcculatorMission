package calculator.domain.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateServiceTest {

    CalculateService calculateService = new CalculateService();

    @DisplayName("sut는 stack으로 표현된 수식을 입력받아 후위표현식으로 계산한 결과를 반환한다.")
    @Test
    void operandValidateTest(){
        // Arrange
        Stack<String> postfixExpression = new Stack<>();
        postfixExpression.push("3");
        postfixExpression.push("4");
        postfixExpression.push("2");
        postfixExpression.push("*");
        postfixExpression.push("-");
        String expectedResult = "5";

        // Act
        var actual = calculateService.calculatePostfixExpression(postfixExpression);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);

    }
}
