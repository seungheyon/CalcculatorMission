package calculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OperandTest {

    @DisplayName("sut는 operand가 숫자가 아닐 경우 예외를 발생시킨다.")
    @Test
    void operandValidateTest(){
        // Arrange
        String wrongNumber = "wrongNumber";

        assertThatThrownBy(() -> new Operand(wrongNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
