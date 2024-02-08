package calculator.domain;

import calculator.domain.constants.OperatorEnum;

import java.util.Arrays;

public class Operator {
    private final String symbol;

    public Operator(String symbol) {
        validateSymbolIsOperator(symbol);
        this.symbol = symbol;
    }

    private void validateSymbolIsOperator(String symbol){
        if (Arrays.stream(OperatorEnum.Operator.values())
                .noneMatch(operatorEnum -> operatorEnum.getSymbol().equals(symbol))) {
            throw new IllegalArgumentException("Invalid operator symbol");
        }
    }

    public String getSymbol(){
        return symbol;
    }
}
