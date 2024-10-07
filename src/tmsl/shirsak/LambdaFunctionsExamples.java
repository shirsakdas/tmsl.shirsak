package tmsl.shirsak;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class LambdaFunctionsExamples {
    public static void main(String[] args) {
        System.out.print("Enter Full Name: ");
        String string = new Scanner(System.in).nextLine();

        UnaryOperator<String> getFirstName = str -> str.substring(0,str.indexOf(' '));
        System.out.println("First Name: "+getFirstName.apply(string));

        UnaryOperator<String> getLastName = str -> str.substring(str.indexOf(' ')+1);
        System.out.println("Last Name: "+getLastName.apply(string));
    }
}
