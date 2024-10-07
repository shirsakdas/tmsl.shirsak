package tmsl.shirsak;

import java.util.*;

class Encapsulation1 {

    private int length;
    private int breadth;
    private int side;

    public static void main(String[] args) {
        int choice, Length, Breadth, Side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice\n1. Area of Rectangle\n2. Area of Square");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter length and breadth of rectangle");
                Length = sc.nextInt();
                Breadth = sc.nextInt();
            case 2:
                System.out.println("Enter side of square");
                Side = sc.nextInt();
            default:
                System.out.println("Wrong Choice");
        }
        Encapsulation1 ob = new Encapsulation1();
        if (choice == 1) {
            //ob.setlength(Length);
            //ob.setbreadth(Breadth);
        }
        if (choice == 2) {
            //ob.setside(Side);
        }
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
}