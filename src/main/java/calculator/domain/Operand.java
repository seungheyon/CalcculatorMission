package calculator.domain;

public class Operand {
   private int operand;

    public Operand(String operand) {
        this.operand = validateIsNumber(operand);
    }

    private int validateIsNumber(String number){
       return Integer.parseInt(number);
    }
}
