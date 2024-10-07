package tmsl.shirsak;
// Write a Predicate<List<String>> to check if a given list contains the element "Java"

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaCheckParticularWordInAString {
    private void inputList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of strings\nType 'finish' to stop entering");
        List<String> getInputStringList = new ArrayList<>();
        int count = 1;
        do {
            System.out.printf("String %d: ", count++);
            getInputStringList.add(scanner.nextLine());
        } while (!getInputStringList.get(count - 2).equalsIgnoreCase("finish"));

        searchWord(getInputStringList, scanner);
    }

    private void searchWord(List<String> getInput, Scanner scanner){
        System.out.print("Enter word to search for in the List: ");
        String str = scanner.nextLine();

        Predicate<List<String>> matchInputString = list -> {
            for(String search : list){
                if(search.equalsIgnoreCase(str)){
                    return true;
                }
            }
            return false;
        };
        System.out.println(matchInputString.test(getInput));
    }

    public static void main(String[] args) {
        LambdaCheckParticularWordInAString obj = new LambdaCheckParticularWordInAString();
        obj.inputList();
    }
}