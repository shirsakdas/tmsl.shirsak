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
public class PangramString1 {
    String str;
    String notPresent = "";
    public void inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = sc.nextLine().toLowerCase();
    }

    public int checkPangram(){
        int alphabetNumber = 97,count = 0, flag, i, j;
        for(i=0;i<str.length();i++){
            flag = 0;
            for(j=0;j<str.length();j++){
                if(str.charAt(j) == alphabetNumber){
                    count++;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                notPresent = notPresent + str.charAt(j) + " ";
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
            System.out.println("Alphabets not present: "+ notPresent );
        }
    }

    public static void main(String[] args) {
        PangramString1 ob=new PangramString1();
        ob.inputString();
        ob.displayPangram();
    }
}
