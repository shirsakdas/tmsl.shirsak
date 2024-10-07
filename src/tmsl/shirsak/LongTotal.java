package tmsl.shirsak;
import java.util.*;
public class LongTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers followed by spaces: ");
        String str = sc.nextLine();
        str = str.trim();
        int sum = 0;
        String str1 = str + " ";
        String str2 = "";
        for (int i=0;i<str1.length();i++){
            while(str1.charAt(i) != ' ') {
                str2 = str2 + str1.charAt(i);
                i++;
            }
            sum += Integer.parseInt(str2);
            str2 = "";
        }
        System.out.println("Sum of all the numbers: "+sum);
    }
}
