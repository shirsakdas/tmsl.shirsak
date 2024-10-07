package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 */
public class Pattern5 {
    public static void main(String[] args) {
        Pattern5 obj = new Pattern5();
        obj.display();
    }

    public void display(){
        int n = 5;
        int c = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*c-2;j++){
                System.out.print(" ");
            }
            c--;
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
