package tmsl.shirsak;

import java.util.*;

class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim = sc.nextInt();
        int i, arr[] = new int[lim], last;
        for (i = 0; i < lim; i++) {
            System.out.printf("Enter element %d: ", (i + 1));
            arr[i] = sc.nextInt();
        }
        sc.close();
        last = arr[lim - 1];
        for (i = lim-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (i = 0; i < lim; i++)
            System.out.print(arr[i] + " ");
    }
}