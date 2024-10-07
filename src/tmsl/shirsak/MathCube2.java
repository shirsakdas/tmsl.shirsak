package tmsl.shirsak;

import java.util.*;

class MathCube2 {
    double number;

    public static void main(String args[]) {
        MathCube2 ob = new MathCube2();
        ob.input();
        ob.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        sc.close();
    }

    public boolean calculate() {
        double input = number;
        while (input >= 3) {
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println(calculate());
    }
}