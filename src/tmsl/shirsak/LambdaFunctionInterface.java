package tmsl.shirsak;
// Write a lambda expression that takes a string and returns its length.
// Use this lambda with the map function to convert a list of strings to a list of their lengths.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class LambdaFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        System.out.println("Enter the list of numbers\nType 'finish' to stop entering");
        List<String> getInputStringList = new ArrayList<>();
        int count = 1;
        do {
            System.out.printf("String %d: ", count++);
            getInputStringList.add(new Scanner(System.in).nextLine());
        } while (!getInputStringList.get(count - 2).equalsIgnoreCase("finish"));

        List<Integer> getLengthList = new ArrayList<>();
        for (int i = 0; i < getInputStringList.size() - 1; i++) {
            getLengthList.add(getLength.apply(getInputStringList.get(i)));
        }
        System.out.println(getLengthList);
    }
}
