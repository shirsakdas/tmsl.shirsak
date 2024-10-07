package tmsl.shirsak;

import java.util.Scanner;

public class Word {
    int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        return cal(str);
    }


    int cal(String st) {
        String[] words = st.split("\\s+");
        return words.length;
    }

    void output() {
        System.out.println("The number of words in the sentence is " + input());
    }

    public static void main(String[] args) {
        Word wd = new Word();
        wd.output();
    }
}