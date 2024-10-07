package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */
public class Pattern8 {
    public static void main(String[] args) {
        Pattern8 obj = new Pattern8();
        obj.display();
    }

    public void display(){
        int n = 5;
        int c = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i*2-2;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=2*c-1;k++){
                System.out.print("* ");
            }
            c--;
            System.out.println();
        }
    }
}
