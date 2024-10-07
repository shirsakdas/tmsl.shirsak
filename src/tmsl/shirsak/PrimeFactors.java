package tmsl.shirsak;

import java.util.*;
class PrimeFactors{
    public int inputNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public void primeFactors(){
        int num = inputNumber();
        while(num % 2 == 0){
            System.out.print("2 ");
            num /= 2;
        }
        int i = 3;
        while(num != 1){
            if(num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
            else{
                i += 2;
            }
        }
    }

    public static void main(String[] args) {
        PrimeFactors ob = new PrimeFactors();
        ob.primeFactors();
    }
}