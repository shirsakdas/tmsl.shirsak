package tmsl.shirsak;

import java.util.*;

class LinearSearch {
    public static void main(String args[]) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int limit = sc.nextInt();
        int arr[] = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int ans = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            if (arr[i] == ans) {
                flag = true;
                break;
            }
        }
        

    }
}