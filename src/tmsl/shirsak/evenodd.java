package tmsl.shirsak;

import java.util.*;

class evenodd {

    int inp;

    public static void main(String args[]) {
        evenodd ob = new evenodd();
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
        if (inp % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}