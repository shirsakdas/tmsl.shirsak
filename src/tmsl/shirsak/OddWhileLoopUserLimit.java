package tmsl.shirsak;

import java.util.*;

class OddWhileLoopUserLimit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int low = sc.nextInt();
        System.out.println("Enter the higher limit");
        int high = sc.nextInt();
        sc.close();
        System.out.printf("All even numbers from %d to %d are: \n", low, high);
        while (low <= high) {
            if (low % 2 == 0) {
                System.out.print(low + " ");
            }
            low++;
        }
    }
}