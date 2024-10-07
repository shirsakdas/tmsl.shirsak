package tmsl.shirsak;

import java.util.*;

class Divisibleby3and6 {

    int inp;

    public static void main(String args[]) {
        Divisibleby3and6 ob = new Divisibleby3and6();
        ob.input();
        ob.display();
    }

    public void input() {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();
        sc.close();
    }

    public boolean check() {
        return (inp % 6 == 0 && inp % 3 == 0);
    }

    void display() {
        if (check())
            System.out.println("The number is divisible by both 3 and 6");
        else
            System.out.println("The number is not divisible by both 3 and 6");
    }
}