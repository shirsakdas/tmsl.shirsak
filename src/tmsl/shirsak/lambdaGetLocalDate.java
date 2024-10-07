package tmsl.shirsak;

import java.time.LocalDate;
import java.util.function.Supplier;

public class lambdaGetLocalDate {
    public static void main(String[] args) {
        Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();
        System.out.println(localDateSupplier.get());
    }
}
