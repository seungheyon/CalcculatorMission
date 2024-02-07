package calculator.domain.operators;

import calculator.domain.Operand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OperatorTest {
    @DisplayName("sut는 operator가 연산 기호가 아닐 경우 예외를 발생시킨다.")
    @Test
    void operatorValidateTest(){
        // Arrange

        String wrongOperator = "korea";

        assertThatThrownBy(() -> new Operand(wrongOperator))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
