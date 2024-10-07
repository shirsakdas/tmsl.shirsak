package tmsl.shirsak;

import java.util.*;
class AnagramWord {
    String word1, word2;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        word1 = sc.nextLine().trim();
        System.out.print("Enter second word: ");
        word2 = sc.nextLine().trim();
    }

    public void anagram() {
        int count1 = 0, count2 = 0;
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                char ch1 = word1.charAt(i);
                for (int j = 0; j <word2.length();j++){
                    char ch2 = word2.charAt(j);
                    if(ch1 == ch2){
                        count1++;
                        //break;
                    }
                }
            }
        }
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                char ch1 = word2.charAt(i);
                for (int j = 0; j <word1.length();j++){
                    char ch2 = word1.charAt(j);
                    if(ch1 == ch2){
                        count2++;
                        //break;
                    }
                }
            }
        }
        if(count1 == count2 && count1 != 0){
        System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }

    public static void main(String[] args) {
        AnagramWord ob = new AnagramWord();
        ob.input();
        ob.anagram();
    }
}