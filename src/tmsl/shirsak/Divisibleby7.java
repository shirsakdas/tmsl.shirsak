package tmsl.shirsak;

import java.util.*;

class Divisibleby7 {

    int inp;

    public static void main(String args[]) {
        Divisibleby7 ob = new Divisibleby7();
        ob.input();
        ob.display();
    }

    void input() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        sc.close();
    }

    int check() {
        if (inp % 7 == 0)
            return 1;
        else
            return 0;
    }

    void display() {
        if (check() == 1)
            System.out.println("The number is divisible by 7");
        else
            System.out.println("The number is not divisible by 7");
    }
}