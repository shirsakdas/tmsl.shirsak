package tmsl.shirsak;

import java.util.*;

class PrintNaturalNumbersUsingWhileLoop_1toLimit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int num = sc.nextInt();
        sc.close();
        int i = 1;
        System.out.println("The numbers are:");
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}