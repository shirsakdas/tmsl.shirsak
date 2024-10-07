package tmsl.shirsak;/* This Series prints the numbers as 1 + 0 , 1 + 1, 2 + 2, 4 + 3, 7 + 4, ......
   1 2 4 7 11 ........ limit
*/

import java.util.*;

class Series3 {
    public static void main(String[] args) {
        int lim, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        lim = sc.nextInt();
        sc.close();
        System.out.print("The Series: ");
        for (int i = 0; i < lim; i++) {
            System.out.print(i + j + " ");
            j += i;
        }
    }
}