package tmsl.shirsak;

import java.util.List;
import java.util.function.Function;

public class LambdaListSizeFunction {

    public void inputList(){

    }

    public static void main(String[] args) {
        Function<List<String>, Integer> listIntegerFunction = list -> list.size();
        System.out.println(listIntegerFunction.apply(List.of("2","4","6","1","3")));
    }
}
