package tmsl.shirsak;
// Given a list of integers user Lambda Expression to filter out the even numbers and
// print the remaining odd numbers

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaFilteringWithPredicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<Integer> getOddNumbers = oddNumbers -> oddNumbers % 2 != 0;
        UnaryOperator<List<Integer>> newList = filteredList -> {
            List<Integer> getNewList = new ArrayList<>();
            for (int i = 0; i < filteredList.size() - 1; i++) {
                if (getOddNumbers.test(filteredList.get(i))) {
                    getNewList.add(filteredList.get(i));
                }
            }
            return getNewList;
        };

        System.out.println("Enter the list of numbers\nPress -1 to stop entering");
        List<Integer> getInput = new ArrayList<>();
        int count = 1;
        do {
            System.out.printf("Element %d: ", count++);
            getInput.add(scanner.nextInt());
        } while (getInput.get(count - 2) != -1);

        System.out.println(newList.apply(getInput));
    }
}
