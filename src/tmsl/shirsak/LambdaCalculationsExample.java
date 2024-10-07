package tmsl.shirsak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LambdaCalculationsExample {

    @FunctionalInterface
    public interface InterfaceName {
        double performOperation(double num1, double num2);
    }

    public double addLambda(double num1, double num2) {
        InterfaceName addition = (numb1, numb2) -> num1 + num2;
        return addition.performOperation(num1, num2);
    }

    public double subtractLambda(double num1, double num2) {
        InterfaceName subtraction = (numb1, numb2) -> num1 - num2;
        return subtraction.performOperation(num1, num2);
    }

    public double multiplyLambda(double num1, double num2) {
        InterfaceName multiplication = (numb1, numb2) -> num1 * num2;
        return multiplication.performOperation(num1, num2);
    }

    public double divideLambda(double num1, double num2) {
        InterfaceName division = (numb1, numb2) -> num1 / num2;
        return division.performOperation(num1, num2);
    }

    public void inputNumbers() {
        double number1 = 0.0, number2 = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        try {
            number1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Non Double Input!!");
            System.exit(1);
        }
        System.out.print("Enter number 2: ");
        try {
            number2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Non Double Input!!");
            System.exit(1);
        }

        System.out.print("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                Enter your choice:\s""");
        try {
            System.out.println("Answer: " + outputNumbers(scanner.nextInt(), number1, number2));
        } catch (InputMismatchException e) {
            System.out.println("Non Integer Input!!");
        } finally {
            System.out.println("THANK YOU!!");
            System.exit(1);
        }

    }

    public double outputNumbers(int choice, double number1, double number2) {
        LambdaCalculationsExample obj = new LambdaCalculationsExample();
        return switch (choice) {
            case 1 -> obj.addLambda(number1, number2);
            case 2 -> obj.subtractLambda(number1, number2);
            case 3 -> obj.multiplyLambda(number1, number2);
            case 4 -> obj.divideLambda(number1, number2);
            default -> -1.0;
        };
    }

    public static void main(String[] args) {
        new LambdaCalculationsExample().inputNumbers();
    }
}
