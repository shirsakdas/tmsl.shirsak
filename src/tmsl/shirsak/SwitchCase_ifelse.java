package tmsl.shirsak;

import java.util.*;

class SwitchCase_ifelse {
    int choice;

    public static void main(String[] args) {
        SwitchCase_ifelse ob = new SwitchCase_ifelse();
        ob.input();
        ob.switchcase();
        ob.ifelse();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice from 1 to 5: ");
        choice = sc.nextInt();
        sc.close();
    }

    public void switchcase() {
        switch (choice) {
            case 1 -> System.out.println("1 in words is One");
            case 2 -> System.out.println("2 in words is Two");
            case 3 -> System.out.println("3 in words is Three");
            case 4 -> System.out.println("4 in words is Four");
            case 5 -> System.out.println("5 in words is Five");
            default -> System.out.println("Invalid Choice");
        }
    }

    public void ifelse() {
        if (choice == 1)
            System.out.println("1 in words is One");
        else if (choice == 2)
            System.out.println("2 in words is Two");
        else if (choice == 3)
            System.out.println("3 in words is Three");
        else if (choice == 4)
            System.out.println("4 in words is Four");
        else if (choice == 5)
            System.out.println("5 in words is Five");
        else
            System.out.println("Invalid Choice");
    }
}