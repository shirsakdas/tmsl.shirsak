package tmsl.shirsak;

import java.util.Scanner;
class PalindromeWordsExtractor {
    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void extractPalindromeWords(String inputString) {
        String[] words = inputString.split("\\s+");

        System.out.println("Palindrome words in the given string: ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                System.out.println(words[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine().trim().toUpperCase();
        sc.close();

        extractPalindromeWords(inputString);
    }
}