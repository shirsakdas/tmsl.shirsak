package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
 */
public class Pattern6 {
    public static void main(String[] args) {
        Pattern6 obj = new Pattern6();
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
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
