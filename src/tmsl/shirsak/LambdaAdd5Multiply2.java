package tmsl.shirsak;

import java.util.Scanner;
import java.util.function.Function;

class AddWith5{
    public static Function<Integer, Integer> addWith5() {
        Function<Integer, Integer> function1 = number -> number + 5;
        return function1;
    }
}

class MultiplyBy2{
    public static Function<Integer, Integer> multiplyBy2() {
        Function<Integer, Integer> function2 = number -> number * 2;
        return function2;
    }
}

class TakeInput{
    public int takeInput(){
        System.out.print("Enter a number: ");
        return new Scanner(System.in).nextInt();
    }
}

class GiveOutput{
    public void giveOutput(){
        TakeInput obj = new TakeInput();

        System.out.println(AddWith5.addWith5().andThen(MultiplyBy2.multiplyBy2()).apply(obj.takeInput()));
    }
}

public class LambdaAdd5Multiply2 {

    public static void main(String[] args) {
        new GiveOutput().giveOutput();
    }
}
