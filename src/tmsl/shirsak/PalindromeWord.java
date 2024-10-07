package tmsl.shirsak;

import java.util.*;
class PalindromeWord {
    String str, str1 = "", str2 = "";

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        str = sc.nextLine();
        str = str.trim();
        str = str + " ";
    }

    public void display() {
        System.out.println("Palindrome Words Are: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                checkPalindrome(str.charAt(i));
            }
            else {
                if(str1.equalsIgnoreCase(str2)) {
                    System.out.println(str1);
                }
                str1 = "";
                str2 = "";
            }
        }
    }

    public void checkPalindrome(char ch){
        str1 = str1 + ch;
        str2 = ch + str2;
    }

    public static void main(String[] args) {
        PalindromeWord ob = new PalindromeWord();
        ob.input();
        ob.display();
    }
}