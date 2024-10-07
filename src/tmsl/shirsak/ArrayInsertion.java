package tmsl.shirsak;

import java.util.*;

class FizzBuzz {

    public int sequenceofturns() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of turns: ");
        int turns = sc.nextInt();
        return turns;
    }

    public void fizzbuzz() {
        Scanner sc = new Scanner(System.in);
        int limit = sequenceofturns();
        int[] arr = new int[limit];
        String[] newarr = new String[limit];
        for (int i = 0; i < limit; i++) {
            System.out.printf("Enter value %d: ", (i + 1));
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < limit; i++) {
            if (arr[i] % 15 == 0) {
                newarr[i] = "FizzBuzz";
            }

            else if (arr[i] % 3 == 0) {
                newarr[i] = "Fizz";
            }

            else if (arr[i] % 5 == 0) {
                newarr[i] = "Buzz";
            } else {
                newarr[i] = String.valueOf(arr[i]);
            }
        }
        for(int i = 0;i<limit;i++){
            System.out.print(newarr[i]+" ");
        }
    }

    public static void main(String[] args) {
        FizzBuzz ob = new FizzBuzz();
        ob.fizzbuzz();
    }
}