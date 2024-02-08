package calculator.domain.operators;

public class Division implements Operators {

    @Override
    public Double operate(Double operand1, Double operand2){
        if(operand2==0){
            throw new IllegalArgumentException();
        }
        return operand1/operand2;
    }
}
