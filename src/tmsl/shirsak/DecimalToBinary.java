package tmsl.shirsak;

import java.util.Scanner;

public class DecimalToBinary {
    public int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public int decToBin() {
        int num=input();
        String str="";
        while (num != 0){
            str = Integer.toString(num%2).concat(str);
            num = num/2;
        }
        return Integer.parseInt(str);
    }

    public void display(){
        /*int num = input();*/
        System.out.println("Decimal value is: "+decToBin());
    }

    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        obj.display();
    }
}
