package tmsl.shirsak;

import java.util.function.Function;

public class LambdaSquareFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> integerIntegerFunction = number -> number*number;
        System.out.println(integerIntegerFunction.apply(6));
    }
}
