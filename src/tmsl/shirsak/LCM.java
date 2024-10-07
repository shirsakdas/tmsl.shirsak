package tmsl.shirsak;

import java.util.*;

class LCM {
    int num1, num2;

    public static void main(String[] args) {
        LCM ob = new LCM();
        ob.input();
        ob.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        sc.close();
    }

    public int calculate() {
        int lcm = 1, counter = 1;
        if (num1 >= num2) {
            while (counter <= num1) {
                if (num1 % counter == 0 && num2 % counter == 0) {
                    lcm = lcm * counter;
                } else if (num1 % counter == 0 || num2 % counter == 0) {
                    lcm = lcm * counter;
                }
                counter++;
            }
        } else {
            while (counter <= num2) {
                if (num1 % counter == 0 && num2 % counter == 0) {
                    lcm = lcm * counter;
                } else if (num1 % counter == 0 || num2 % counter == 0) {
                    lcm = lcm * counter;
                    counter++;
                }
            }
        }
        return lcm;
    }

    public void display() {
        System.out.printf("The LCM of %d and %d is: %d", num1, num2, calculate());
    }
}