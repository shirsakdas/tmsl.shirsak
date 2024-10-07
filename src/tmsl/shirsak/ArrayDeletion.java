package tmsl.shirsak;

import java.util.*;

class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim = sc.nextInt();
        int i, arr1[] = new int[lim], arr2[] = new int[lim - 1], ans,j = 0;
        boolean flag = false;
        String srtr = """
                Ja khushi
                Likhte
                Parbo
                Joto
                Iccha
                Line niye.
                Kono
                Problem
                hobena
                """;
        System.out.println(srtr);
        for (i = 0; i < lim; i++) {
            System.out.printf("Enter element %d: ", (i + 1));
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter number to be deleted: ");
        ans = sc.nextInt();
        for (i = 0; i < lim; i++) {
            if (arr1[i] == ans) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Entered element is not in the array");
        } 
        else {
            for (i = 0; i < lim-1; i++) {
                if (arr1[i] != ans) {
                    arr2[j] = arr1[i];
                j++;
                }
            }
        }
        if(flag){
            for (i = 0; i < lim - 1; i++) {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}