package tmsl.shirsak;

import java.util.*;
class SunnyNumber{
    private int number;
    public int inputNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        return number;
    }

    public boolean calculateSunny(){
        return (Math.sqrt(inputNumber() + 1)) == 0;
    }

    public void displaySunny(){
        if(calculateSunny()){
            System.out.println(number+" is Sunny Number");
        }
        else{
            System.out.println(number+" is not Sunny Number");
        }
    }

    public static void main(String[] args){
        SunnyNumber sunny=new SunnyNumber();
        sunny.displaySunny();
    }
}