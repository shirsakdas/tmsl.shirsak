/*
Collatz Sequence :

If the number is even, divide it by two.
If the number is odd, triple it and add one.
And keep changing the number until it becomes 1, it's always lead to 1.

Task1
Print collatz sequence

Task2
    A. Print maximum length of collatz sequence for all 1<=k<=n
    B. Print the k who have maximum length collatz sequence

Task3
    A. Print maximum value in any collatz sequence for all 1<=k<=n
    B. Print the k whose sequence have maximum value among all value of all sequences for all 1<=k<=n
*/


package tmsl.shirsak;

import java.util.*;
class CollatzSequence{
    int maxNum = 1;

    public int collatz(int input){
        if(input % 2 == 0){
            return input / 2;
        }
        else{
            return input * 3 + 1;
        }
    }

    public String task1(int input){
        String str = Integer.toString(input)+" ";

        if(input == 1){
            return "1";
        }
        else{
            while(input != 1){
                input = collatz(input);
                str = str + Integer.toString(input) + " ";
            }

            return str.trim();
        }
    }

    public String task2(int input){
        int max = 1, iterations = 0, count;
        for(int i = 2;i<= input;i++){
            count = 1;
            iterations = i;
            while(iterations != 1){
                iterations = collatz(iterations);
                count++;
            }
            if(max <= count){
                max = count;
                maxNum = i;
            }
        }
        return Integer.toString(max) + " " + Integer.toString(maxNum);
    }

    public String task3(int input){
        int max = 1, num = maxNum;
        while(maxNum != 1){
            maxNum = collatz(maxNum);
            max = Math.max(max, maxNum);
        }

        return Integer.toString(max) + " " + Integer.toString(num);
    }

    public static void main(String[] args){
        CollatzSequence ob = new CollatzSequence();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println(ob.task1(number) + ", " +ob.task2(number) + ", " + ob.task3(number));
    }
}