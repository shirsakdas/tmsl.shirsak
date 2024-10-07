package tmsl.shirsak;
/* This Series prints two sets of series series1 and series2

   series1 prints the square of each number and adds 1 to it
   1 2 5 10 .......... limit

   series2 prints the cube of each number and adds 1 to it
   1 2 9 28 .......... limit
*/

import java.util.*;

class Series4 {
    int lim, num;

    public static void main(String args[]) {
        Series4 ob = new Series4();
        ob.choice();
    }

    public void series1() {
        for (int i = 0; i < lim; i++) {
            System.out.print(i * i + 1 + " ");
        }
    }

    public void series2() {
        int i = 0;
        do {
            System.out.print(i * i * i + 1 + " ");
            i++;
        } while (i < lim);
    }

    public void choice() {
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.print("Enter the Limit: ");
                lim = sc.nextInt();
                series1();
            case 2:
                System.out.print("Enter the Limit: ");
                lim = sc.nextInt();
                series2();
            default:
                System.out.println("Wrong Choice");
        }
        sc.close();
    }
}