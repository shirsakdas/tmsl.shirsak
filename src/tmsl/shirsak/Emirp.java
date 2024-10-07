package tmsl.shirsak;

import java.util.*;

class Emirp {

    int num, counter = 0, num1, rem, rev;

    public static void main(String[] args) {
        Emirp ob = new Emirp();
        ob.input();
        ob.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        sc.close();
    }

    public boolean checkprime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }

    public boolean checkreversenumber() {
        if (checkprime(num)) {
            num1 = num;
            while (num1 != 0) {
                rem = num1 % 10;
                rev = rev * 10 + rem;
                num1 /= 10;
            }
            if (checkprime(rev))
                return true;
        }
        return false;
    }

    public void display() {
        if (checkreversenumber()) {
            System.out.println("Emirp Number");
        } else {
            System.out.println("Not Emirp Number");
        }
    }
}