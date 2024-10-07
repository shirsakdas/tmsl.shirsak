package tmsl.shirsak;

import java.util.*;
class Shouvik {
    int[] input(int n) {
        int []a = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        return a;
    }

    void output(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Shouvik obj = new Shouvik();
        Scanner p = new Scanner(System.in);
        System.out.print("Enter no. Of elements:  ");
        int n = p.nextInt();
        int []po = obj.input(n);
        obj.output(po);
    }
}