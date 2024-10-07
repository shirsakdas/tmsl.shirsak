package tmsl.shirsak;
/*
Write a program to find index of two array elements whose sum is equal to given value.
Example:
array = [ 1, 2, 4, 5, 8, 10, 11]
sum = 13
Output:
{8, 5}
{11, 2}
*/
import java.util.*;
public class SumCheck {
    int[] arr, arr1;
    int num,sum;
    public void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        num = sc.nextInt();
        arr = new int[num];
        System.out.println("Enter array elements: ");
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum to find numbers: ");
        sum = sc.nextInt();
    }

    public void minimizeArray(){
        arr1 = new int[num];
        int count=0;
        for(int i=0;i<num;i++){
            if(arr[i] < sum){
                arr1[count] = arr[i];
                count++;
            }
        }
    }

    public void displayElements(int num1, int num2){
        if (num1+num2 == sum){
            System.out.println("{"+num1+" "+num2+"}" );
        }
    }

    public void checkElements(){
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                displayElements(arr1[i],arr1[j]);
            }
        }
    }

    public static void main(String[] args) {
        SumCheck ob=new SumCheck();
        ob.inputArray();
        ob.minimizeArray();
        ob.checkElements();
    }
}
