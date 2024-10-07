package tmsl.shirsak;

import java.util.Scanner;
class TotalChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int []charFrequency = new int[256];// ASCII value can be maximum up to 256
        inputString = inputString.toLowerCase();// Convert the input string to lowercase
        for (int i = 0; i < inputString.length(); i++) {// Iterate through each character in the input string
            char c = inputString.charAt(i);
            charFrequency[c]++;// Increment the frequency of the character
        }

        for (int i = 0; i < charFrequency.length; i++) {// Print the character-frequency pairs
            if(i == 32 && charFrequency[i] > 0){
                System.out.println("space : " + charFrequency[i]);
            }
            else {
                if (charFrequency[i] > 0) {
                    System.out.println((char) i + " : " + charFrequency[i]);
                }
            }
        }

        sc.close();
    }
}