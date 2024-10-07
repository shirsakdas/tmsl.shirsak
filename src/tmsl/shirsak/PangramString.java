package tmsl.shirsak;
/*
Given string str, the task is to write Java Program check whether the given string is Pangram or not.

A string is a Pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.

Examples:

Input: str = “Abcdefghijklmnopqrstuvwxyz”
Output: Yes
Explanation: The given string contains all the letters from a to z (ignoring case).

Input: str = “GeeksForGeeks”
Output: No
Explanation: The given string does not contain all the letters from a to z (ignoring case).

Also print the characters not present inside the string in case of 'No'
*/

import java.util.*;
public class PangramString {
    String str;
    public void inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = sc.nextLine().toLowerCase();
    }

    public int checkPangram(){
        int alphabetNumber = 97,count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == alphabetNumber){
                    count++;
                    break;
                }
            }
            alphabetNumber++;
        }
        return count;
    }

    public void displayPangram(){
        if(checkPangram() == 26){
            System.out.println("Pangram String");
        }
        else{
            System.out.println("Not Pangram String");
        }
    }

    public static void main(String[] args) {
        PangramString ob=new PangramString();
        ob.inputString();
        ob.displayPangram();
    }
}
