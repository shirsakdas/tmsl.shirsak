package tmsl.shirsak;

import java.util.*;

class Factorial {
    int num;

    public static void main(String args[]) {
        Factorial obj = new Factorial();
        obj.input();
        obj.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number whose factorial is to be found: ");
        num = sc.nextInt();
        sc.close();
    }

    public int calculate() {
        int sum = 1, i;
        if (num > 0)
            for (i = num; i >= 1; i--)
                sum *= i;
        return sum;
    }

    public void display() {
        if (num == 0)
            System.out.println("The Factorial of " + num + " is: 1");
        else if (num < 0)
            System.out.println("Number must be non-negative");
        else
            System.out.println("The Factorial of " + num + " is: " + calculate());
    }
}