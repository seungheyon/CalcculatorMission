package calculator.domain.operators;

public class Multiplication implements Operators {

    @Override
    public Double operate(Double operand1, Double operand2){
        return operand1 * operand2;
    }
}
