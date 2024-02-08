package calculator.domain;

public class Operand {
   private Double operand;

    public Operand(String operand) {
        this.operand = validateIsNumber(operand);
    }

    private Double validateIsNumber(String number){
       return Double.parseDouble(number);
    }

    public Double getOperand() {
        return operand;
    }
}
