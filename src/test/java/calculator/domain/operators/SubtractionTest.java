package calculator.domain.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractionTest {

    Subtraction subtraction = new Subtraction();

    @DisplayName("sut는 operand1 에서 operand2 를 뺀 값을 반환한다.")
    @Test
    void subtractionOperationTest(){
        // Arrange
        String operand1 = "5.0";
        String operand2 = "2.0";
        String expectedResult = "3.0";

        // Act
        var actual = subtraction.subtraction(operand1, operand2);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);
    }
}
