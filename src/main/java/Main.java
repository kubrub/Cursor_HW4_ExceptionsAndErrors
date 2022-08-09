import Exception.MyOwnException;
import Services.CalculateOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyOwnException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the second value, please: ");
        int x;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer!\nEnter correct value");
            scanner.next();
        }
        x = scanner.nextInt();
        System.out.print("Enter the action (+,-,/,*): ");
        String symbol = scanner.next();

        System.out.print("Enter the second value, please: ");
        int y;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not an integer!\nEnter correct value");
            scanner.next();
        }
        y = scanner.nextInt();

        CalculateOperation calculateOperation = new CalculateOperation(symbol, x, y);
        calculateOperation.calculate();
    }
}
