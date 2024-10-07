package tmsl.shirsak;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class LambdaImplementingBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> getSum = (num1, num2) -> num1 + num2;
        System.out.println("Enter 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum = "+getSum.apply(scanner.nextInt(), scanner.nextInt()));
    }
}
