package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
        1
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
 */
import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Pattern7 obj = new Pattern7();
        obj.display();
    }

    public void display(){
        int n = 5;
        int c = n;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*c-2;j++){
                System.out.print(" ");
            }
            c--;
            for(int k=1;k<=2*i-1;k++){
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
}
