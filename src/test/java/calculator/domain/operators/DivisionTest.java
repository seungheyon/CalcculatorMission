package calculator.domain.operators;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DivisionTest {

    Division division = new Division();

    @DisplayName("sut는 operand1 에서 operand2 를 나눈 값을 반환한다.")
    @Test
    void divisionOperationTest(){
        // Arrange
        String operand1 = "6.0";
        String operand2 = "2.0";
        String expectedResult = "3.0";

        // Act
        var actual = division.division(operand1, operand2);

        // Assert
        assertThat(actual).isEqualTo(expectedResult);
    }

    @DisplayName("sut는 0으로 나눌 경우 예외를 반환한다.")
    @Test
    void checkZeroDivide(){
        // Arrange
        String operand1 = "6.0";
        String operand2 = "0";

        // Assert
        assertThatThrownBy(() -> division.division(operand1, operand2))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
