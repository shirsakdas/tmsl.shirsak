package tmsl.shirsak;/*
Write a program in JAVA to show all the factors of a number which is taken as an input from the user
*/

import java.util.*;

class Question4 {
    int num;

    public static void main(String[] args) {
        Question4 ob = new Question4();
        ob.input();
        ob.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factor is to be found:");
        num = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.printf("The factors of %d are: ", num);
        int count = 1;
        while (count <= num) {
            if (num % count == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }
}