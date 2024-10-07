package tmsl.shirsak;

import java.util.function.BiFunction;

public class LambdaBiFunctionMaximum {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> integerBiFunction = (num1, num2) -> {
            if (num1 > num2) {
                return num1;
            } else if (num2 > num1) {
                return num2;
            } else {
              return -1;
            }
        };
        System.out.println("The max of two numbers is: "+integerBiFunction.apply(55, 56));
    }
}
