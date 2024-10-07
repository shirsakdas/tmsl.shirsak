package tmsl.shirsak;

import java.util.*;

class HCF {
    int num1, num2;

    public static void main(String[] args) {
        HCF ob = new HCF();
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
        int hcf = 1, counter = 1;
        if (num1 >= num2) {
            while (counter <= num1) {
                if (num1 % counter == 0 && num2 % counter == 0) {
                    hcf = counter;
                }
                counter++;
            }
        } else {
            while (counter <= num2) {
                if (num1 % counter == 0 && num2 % counter == 0) {
                    hcf = counter;
                }
                counter++;
            }
        }
        return hcf;
    }

    public void display() {
        System.out.printf("The HCF of %d and %d is: %d", num1, num2, calculate());
    }
}