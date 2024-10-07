package tmsl.shirsak;

import java.util.*;

public class AreaOfSquare {

    float side;

    public static void main(String[] args) {
        AreaOfSquare ob = new AreaOfSquare();
        ob.input();
        ob.display();
    }

    public void input() {
        System.out.println("Enter a side of square");
        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
        sc.close();
    }

    public float calculate() {
        return (side * side);
    }

    void display() {
        System.out.println("The area of the square of side " + side + " is: " + calculate());
    }
}