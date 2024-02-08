package calculator.domain.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionTest {

    Addition addition = new Addition();

    @DisplayName("sut는 operand1 과 operand2 를 더한 값을 반환한다.")
    @Test
    void additionOperationTest(){
        // Arrange
        Double operand1 = 2.0;
        Double operand2 = 3.0;
        Double expectedResult = 5.0;

        // Act
        var actual = addition.operate(operand1, operand2);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);
    }
}
