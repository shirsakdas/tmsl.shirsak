package tmsl.shirsak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class LambdaWithCollections {
    private static void takeInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> getInputStringList = new ArrayList<>();
        System.out.println("Enter the list of strings\nType 'finish' to stop entering");
        int count = 1;
        do {
            System.out.printf("String %d: ", count++);
            getInputStringList.add(scanner.nextLine());
        } while (!getInputStringList.get(count - 2).equalsIgnoreCase("finish"));
        //getInputStringList.forEach();
        printFiltered(getInputStringList);
    }

    public static void printFiltered(List<String> getInputStringList) {
        List<String> filteredList = new ArrayList<>();
        UnaryOperator<List<String>> unary = li -> {
            for (int i = 0; i < getInputStringList.size(); i++) {
                String str = getInputStringList.get(i).toLowerCase();
                if (str.charAt(0) == 'a') {
                    filteredList.add(str);
                }
            }
            return filteredList;
        };
        System.out.println(unary.apply(getInputStringList));
    }

    public static void main(String[] args) {
        takeInput();
    }
}
