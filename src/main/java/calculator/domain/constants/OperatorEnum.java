package calculator.domain.constants;

public class OperatorEnum {
    public enum Operator{
        ADDITION("+", 10),
        SUBTRACTION("-", 10),
        MULTIPLICATION("*", 12),
        DIVISION("/", 12);
        
        private final String symbol;
        private final int priority;

        Operator(String symbol, int priority) {
            this.symbol = symbol;
            this.priority = priority;
        }

        public String getSymbol(){
            return symbol;
        }

        public int getPriority(){
            return priority;
        }
    }
}
