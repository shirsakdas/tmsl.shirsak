package tmsl.shirsak;

import java.util.Scanner;

@FunctionalInterface
interface TriFunction{
    String concatenate(String str1, String str2, String str3);
}

public class LambdaCustomFunction {
    public void input3Strings(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();
        System.out.print("Enter String 3: ");
        String str3 = sc.nextLine();
        System.out.println(concatenate3Strings(str1,str2,str3));
    }

    public String concatenate3Strings(String getStr1, String getStr2, String getStr3){
        TriFunction triFunction = (str1, str2, str3) -> str1+" "+str2+" "+str3;
       return triFunction.concatenate(getStr1, getStr2, getStr3);
    }

    public static void main(String[] args) {
        LambdaCustomFunction obj = new LambdaCustomFunction();
        obj.input3Strings();
        //obj.concatenate3Strings();
    }
}
