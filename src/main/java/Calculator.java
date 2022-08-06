public class Calculator implements CalculatorInterface{
    private float res = 0;

    @Override
    public void addition(int num1, int num2) throws MyOwnException {
        res = num1 + num2;
        if (res > 100){
            System.out.print("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of addition is " + res);
    }

    @Override
    public void subtraction(int num1, int num2) {
        res = num1 - num2;
        if (res > 100){
            System.out.print("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of subtraction is " + res);
    }

    @Override
    public void multiplication(int num1, int num2) {
        res = num1 * num2;
        if (res > 100){
            System.out.print("Result is bigger than 100. You are on fire!");}
        else System.out.println("The result of multiplication is " + res);
    }

    @Override
    public void division(int num1, int num2) {
        try{
            res = (float)num1 / num2;
            if (res == Double.POSITIVE_INFINITY ||res == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
            else{
                if (res > 100){
                    System.out.print("Result is bigger than 100. You are on fire!");}
                else System.out.println("The result of division is " + res);
            }
        } catch (ArithmeticException ae) {
            System.out.println("You cannot division by 0");
        }
    }
}
