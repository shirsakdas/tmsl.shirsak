package tmsl.shirsak;

import java.util.*;

class Encapsulation {

    int choice, Length, Breadth, Side;
    private int length;
    private int breadth;
    private int side;

    public static void main(String[] args) {
        Encapsulation ob = new Encapsulation();
        ob.display();
        ob.inputrectangle();
        ob.inputsquare();
        ob.calculaterectangle();
        ob.calculatesquare();
    }

    public void setlength(int length) {
        this.length = length;
    }

    public void setbreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setside(int side) {
        this.side = side;
    }

    public int getlength() {
        return length;
    }

    public int getbreadth() {
        return breadth;
    }

    public int getside() {
        return side;
    }

    public void inputrectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle");
        Length = sc.nextInt();
        System.out.println("Enter breadth of Rectangle");
        Breadth = sc.nextInt();
        sc.close();
    }

    public void inputsquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square");
        Side = sc.nextInt();
        sc.close();
    }

    public int calculaterectangle() {
        return length * breadth;
    }

    public int calculatesquare() {
        return side * side;
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n1. Area of Rectangle\n2. Area of Square");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The area of rectangle is " + calculaterectangle());
            case 2:
                System.out.println("The area of rectangle is " + calculatesquare());
        }
        sc.close();
    }
}