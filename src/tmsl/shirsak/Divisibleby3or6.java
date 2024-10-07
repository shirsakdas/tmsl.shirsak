package tmsl.shirsak;

import java.util.*;

class Divisibleby3or6 {

    int inp;

    public static void main(String args[]) {
        Divisibleby3or6 ob = new Divisibleby3or6();
        ob.input();
        ob.display();
    }

    public void input() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        sc.close();
    }

    public int check() {
        if (inp % 6 == 0 && inp % 3 == 0)
            return 1;
        else if (inp % 6 == 0 && inp % 3 != 0)
            return 2;
        else if (inp % 6 != 0 && inp % 3 == 0)
            return 3;
        else
            return 0;
    }

    public void display() {
        if (check() == 1)
            System.out.println("The number is divisible by both 3 and 6");
        else if (check() == 2)
            System.out.println("The number is divisible by 6 only");
        else if (check() == 3)
            System.out.println("The number is divisible by 3 only");
        else
            System.out.println("The number is neither divisible by 3 nor 6");
    }
}