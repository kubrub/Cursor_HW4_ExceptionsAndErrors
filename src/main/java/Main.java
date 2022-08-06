import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyOwnException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int x;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer!\nEnter correct value");
            scanner.next();
        }
        x = scanner.nextInt();
        System.out.print("Enter the action (+,-,/,*): ");
        String symbol = scanner.next();

        System.out.print("Enter the second value: ");
        int y;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer!\nEnter correct value");
            scanner.next();
        }
        y = scanner.nextInt();
        switch (symbol) {
            case "+":
                calculator.addition(x,y);
                break;
            case "-":
                calculator.subtraction(x,y);
                break;
            case "*":
                calculator.multiplication(x,y);
                break;
            case "/":
                calculator.division(x,y);
                break;
            default:
                System.out.println("Incorrect entered math operand");
        }
    }
}
