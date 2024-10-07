package tmsl.shirsak;

import java.util.*;
class FizzBuzzS {
    public static String[] fizzBuzz(int num){
        
        String[] str = new String[num];
        for (int i =0; i<num;i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0){
                str[i] = "FizzBuzz";
            }

            else if ((i+1) % 5 == 0){
                str[i] = "Buzz";
            }
            //Buzz
            else if ((i+1) % 3 == 0) {
                str[i]="Fizz";
            }
            else {
                str[i] = String.valueOf(i + 1); //str[0] = 1,
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] str1 = fizzBuzz(100);
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
