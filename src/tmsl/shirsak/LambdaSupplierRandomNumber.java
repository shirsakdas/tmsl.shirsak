package tmsl.shirsak;

import java.util.function.Supplier;

public class LambdaSupplierRandomNumber {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> (int) (Math.random()*100);

        System.out.println(integerSupplier.get());
    }
}
