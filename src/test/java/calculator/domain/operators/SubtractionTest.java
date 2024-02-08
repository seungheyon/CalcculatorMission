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
        Double operand1 = 5.0;
        Double operand2 = 2.0;
        Double expectedResult = 3.0;

        // Act
        var actual = subtraction.operate(operand1, operand2);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);
    }
}
