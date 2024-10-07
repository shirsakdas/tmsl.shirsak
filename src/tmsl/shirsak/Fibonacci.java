package tmsl.shirsak;

import java.util.*;

class Fibonacci {
    int num;

    public static void main(String args[]) {
        Fibonacci obj = new Fibonacci();
        obj.input();
        obj.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit of Fibonacci series: ");
        num = sc.nextInt();
        sc.close();
    }

    void display() {
        int i = -1, j = 1, sum = 0, c = 0;
        while (c <= num) {
            sum = i + j;
            i = j;
            j = sum;
            System.out.print(sum + " ");
            c++;
        }
    }
}