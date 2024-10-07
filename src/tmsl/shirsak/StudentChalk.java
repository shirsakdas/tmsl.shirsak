package tmsl.shirsak;

import java.util.*;
class StudentChalk {
    int student, chalk[], k, sum = 0;
    public void inputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        student = sc.nextInt();
        System.out.print("Enter the chalks required by each student: ");
        chalk = new int [student];
        for(int i = 0;i < student; i++) {
            chalk[i] = sc.nextInt();
        }
        System.out.print("Enter the number of chalks: ");
        k = sc.nextInt();
    }

    public int calculate_chalks() {
        for(int i = 0;i < student;i++) {
            sum = sum+chalk[i];
        }
        while(k>=sum) {
            k = k-sum;
        }
        for(int i = 0;i < student;i++) {
            if(k > chalk[i]) {
                k = k-chalk[i];
            }
            else {
                k = i;
                break;
            }
        }
        return k;
    }

    public void display(){
        System.out.println("Student number "+calculate_chalks()+" does not have enough chalk, so they will have to replace it.");
    }

    public static void main(String[] args) {
        StudentChalk ob = new StudentChalk();
        ob.inputs();
        ob.display();
    }
}