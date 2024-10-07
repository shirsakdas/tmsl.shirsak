package tmsl.shirsak;

import java.util.*;
public class SelectionSort {
    int num;
    int[] arr;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        num = sc.nextInt();
        arr = new int[num];
        for (int i=0;i<num;i++){
            System.out.print("Enter Value: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void sort(){
        int temp;
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public void showArray(){
        for(int i=0;i<num;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ob=new SelectionSort();
        //System.out.println("Actual Array:");
        ob.getData();
        ob.sort();
        System.out.println("Sorted Array");
        ob.showArray();
    }
}
