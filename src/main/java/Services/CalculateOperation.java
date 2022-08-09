package Services;
import Exception.MyOwnException;

public class CalculateOperation extends Calculator{
    public CalculateOperation(String symbol, int num1, int num2) {
        super(symbol, num1, num2);
    }
    public void calculate() throws MyOwnException {
        switch (symbol) {
            case "+" -> addition(num1, num2);
            case "-" -> subtraction(num1, num2);
            case "*" -> multiplication(num1, num2);
            case "/" -> division(num1, num2);
            default -> System.out.println("Incorrect entered math operand");
        }
    }
}
