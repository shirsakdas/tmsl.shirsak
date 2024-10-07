package tmsl.shirsak;

import java.util.Scanner;

@FunctionalInterface
interface InterfaceName {
    String printName(); //In a Functional Interface, there will be ONLY ONE public abstract method
                        //Methods other than one 'public abstract' specifier can also exist
}

public class LambdaExpression {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        InterfaceName obj = () ->
                "Hello, " +
                        new Scanner(System.in).nextLine();
        System.out.println(obj.printName());
    }
}
