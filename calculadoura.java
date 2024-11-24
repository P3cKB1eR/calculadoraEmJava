package calculadoraEmJava;

import java.util.Scanner;

public class calculadoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request the first number.
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Reques the second number.
        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Request the operation.
        System.out.println("Seelct the operation.");
        System.err.println(" ( +, -, *, / ): ");
        System.out.println("0 - Sair");

        char operation = scanner.next().charAt(0);
        scanner.close();

        double result = 0;

        switch (operation) {
            case '0':
                // In the case of the user wants to leave the application.
                System.out.println("Ending the program!");
                System.exit(0);
                break;

            // Sum of two numbers.
            case '+':
                result = firstNumber + secondNumber;
                break;

            // Addition between two numbers.
            case '-':
                result = firstNumber - secondNumber;
                break;

            // Multiplication between two numbers.
            case '*':
                result = firstNumber * secondNumber;
                break;
            // Division between two numbers.
            case '/':
                result = firstNumber / secondNumber;
                break;

            // Unexpected operator, request new response.
            default:
                System.out.println("Unespect operator, please try again.");
                return;
        }

        System.out.println(firstNumber + " " + operation + " " + secondNumber + ": " + result );
    }

}