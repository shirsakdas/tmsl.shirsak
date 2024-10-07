package tmsl.shirsak;

import java.util.*;

class MathCube {
    double number;

    public static void main(String args[]) {
        MathCube ob = new MathCube();
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
        if (Math.cbrt(number) % 3 == 0)
            return true;
        return false;
    }

    public void display() {
        System.out.println(calculate());
    }
}