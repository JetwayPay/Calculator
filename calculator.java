import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result;

        System.out.print("Enter num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        System.out.print("Enter num2: ");
        num2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        scanner.close();
    }
}