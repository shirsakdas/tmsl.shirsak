package tmsl.shirsak;/*
Write a program in JAVA to print all the odd numbers from m to n where m and n are the limits.
Both the limits are taken from the user.
*/

import java.util.*;

class Question1 {
    int m, n;

    public static void main(String args[]) {
        Question1 ob = new Question1();
        ob.input();
        ob.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first limit");
        m = sc.nextInt();
        System.out.println("Enter the last limit");
        n = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.printf("All odd numbers from %d to %d are: \n", m, n);
        if (m < n) {
            while (m <= n) {
                if (m % 2 != 0) {
                    System.out.print(m + " ");
                }
                m++;
            }
        } else {
            while (m >= n) {
                if (m % 2 != 0) {
                    System.out.print(m + " ");
                }
                m--;
            }
        }
    }
}