package tmsl.shirsak;

import java.util.*;
public class PowerCalculation {
    public static void main(String[] args) {
        int mul=1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        for(int i = 1;i<=exp;i++){
            mul = mul * num;
        }
        System.out.println(mul);
    }
}
