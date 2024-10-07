package tmsl.shirsak;

import java.util.*;
class DuplicateArray {
    int num=3, i,j,count=0;
    int []arr = new int[num];
    public int[] input(int num){
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    int []arr1 = new int [num];
    public void check(){
        for(i=0;i<num;i++){
                            if(arr[i] != arr[i+1]){
                    arr1[count]=arr[i];
                    count++;
                }
            }
        arr1[count--]=arr[num-1];
        }


    public void display(){
        System.out.println("Array with no duplicate numbers:");
        for(i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
    }

    public static void main(String[] args) {
        DuplicateArray ob = new DuplicateArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int num = sc.nextInt();
        ob.input(num);
        ob.check();
        ob.display();
    }
}