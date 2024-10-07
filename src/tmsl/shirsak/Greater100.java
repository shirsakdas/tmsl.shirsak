package tmsl.shirsak;

import java.util.*;

class Divisible_by_7 {

    int inp;

    public static void main(String args[]) {
        Divisible_by_7 ob = new Divisible_by_7();
        ob.input();
        ob.display();
    }

    void input() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        sc.close();
    }

    void display() {
        if (inp > 100)
            System.out.println("The number is greater than 100");
        else if (inp == 100)
            System.out.println("The number is not equal to 100");
        else
            System.out.println("The number is lesser than 100");
    }
}