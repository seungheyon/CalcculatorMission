package calculator.domain.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @DisplayName("sut는 operand1 과 operand2 를 곱한 값을 반환한다.")
    @Test
    void multiplicationOperationTest(){
        // Arrange
        String operand1 = "2.0";
        String operand2 = "3.0";
        String expectedResult = "6.0";

        // Act
        var actual = multiplication.multiplication(operand1, operand2);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);
    }
}
