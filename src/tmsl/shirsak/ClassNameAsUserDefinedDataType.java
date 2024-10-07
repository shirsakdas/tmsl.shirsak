package tmsl.shirsak;

import java.util.Scanner;

class PrimeNumber{
    protected int number;
    public PrimeNumber(int number) {
        this.number=number;
    }
}

public class ClassNameAsUserDefinedDataType {
    private static int number;
    private int flag=0;
    public boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag++;
            }
        }
        return flag == 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = sc.nextInt();
        ClassNameAsUserDefinedDataType ob=new ClassNameAsUserDefinedDataType();
        PrimeNumber pn=new PrimeNumber(number);
        if(ob.checkPrime(pn.number)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
