package tmsl.shirsak;

import java.util.*;
class AnagramWords {
    String word1, word2;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        word1 = sc.nextLine().trim();
        System.out.print("Enter second word: ");
        word2 = sc.nextLine().trim();
    }

    public void sortAlphabetically(String str){
        String temp="";
        for(int i = 0;i<str.length();i++){
            int ch1 = str.charAt(i);
            for(int j = 1;j<str.length()-i;j++){
                int ch2 = str.charAt(j);
                if(ch1 > ch2){
                    temp = temp + ch2;
                    ch1 = (char) ch2;
                    //ch2 = temp;
                }
            }
        }

    }

    public void anagram(){
        sortAlphabetically(word1);

    }

    public static void main(String[] args) {
        AnagramWords ob = new AnagramWords();
        ob.input();
        ob.anagram();
    }
}