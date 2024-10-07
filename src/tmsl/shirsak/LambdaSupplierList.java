package tmsl.shirsak;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class LambdaSupplierList {
    public static void main(String[] args) {
        Supplier<List> listSupplier = () -> {
            List<String> stringList = new ArrayList<>();
            stringList.add("Java");
            stringList.add("Python");
            stringList.add("C++");

            return stringList;
        };
        System.out.println(listSupplier.get());
    }
}
