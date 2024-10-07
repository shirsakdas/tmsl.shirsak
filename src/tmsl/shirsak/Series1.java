package tmsl.shirsak;/* This Series prints all even numbers in between 1 and 50
   2 4 6 8 10 .......... 48
*/

import java.util.*;

class Series1 {
    public static void main(String args[]) {
        Series1 ob = new Series1();
        ob.choice();
    }

    public void forloop() {
        System.out.print("All even numbers from 1 to 50: ");
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void whileloop() {
        System.out.print("All even numbers from 1 to 50: ");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                i++;
            }
        } while (i < 50);
    }

    public void choice() {
        System.out.println("Do you want to view the answers using For-Loop or While Loop?\n1. For Loop\n2. While Loop");
        System.out.print("Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                forloop();
            case 2:
                whileloop();
            default:
                System.out.println("Wrong Choice");
        }
    }
}