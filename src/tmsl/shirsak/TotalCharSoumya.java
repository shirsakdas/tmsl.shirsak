package tmsl.shirsak;

import java.util.Scanner;
class TotalCharSoumya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int []charFrequency = new int[256];// ASCII value can be maximum up to 256

        // Convert the input string to lowercase
        inputString = inputString.toLowerCase();

        // Iterate through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            // Skip whitespace & non-alphabetic characters
            if (Character.isWhitespace(c) || !Character.isLetter(c)) {
                continue;
            }

            // Increment the frequency of the character
            charFrequency[c]++;
        }

        // Print the character-frequency pairs
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                System.out.println((char) i + " : " + charFrequency[i]);
            }
        }

        sc.close();
    }
}