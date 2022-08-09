package Services;

import Exception.MyOwnException;

public class Calculator implements CalculatorInterface {
    private float res = 0;

    public String symbol;
    public int num1;
    public int num2;

    public Calculator(String symbol, int num1, int num2) {
        this.symbol = symbol;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition(int num1, int num2) throws MyOwnException {
        res = num1 + num2;
        if (res > 100){
            throw new MyOwnException("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of addition is " + res);
    }

    public void subtraction(int num1, int num2) throws MyOwnException {
        res = num1 - num2;
        if (res > 100){
            throw new MyOwnException("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of subtraction is " + res);
    }

    public void multiplication(int num1, int num2) throws MyOwnException {
        res = num1 * num2;
        if (res > 100){
            throw new MyOwnException("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of multiplication is " + res);
    }

    public void division(int num1, int num2){
        try{
            res = (float)num1 / num2;
            if (res == Double.POSITIVE_INFINITY ||res == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
            else{
                if (res > 100){
                    throw new MyOwnException("Result is bigger than 100. You are on fire!");}
                else System.out.println("The result of division is " + res);
            }
        } catch (ArithmeticException | MyOwnException ae) {
            System.out.println("You cannot division by 0");
        }
    }


}
