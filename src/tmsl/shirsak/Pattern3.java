package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
*/
class Pattern3 {
    public static void main(String args[]) {
        Pattern3 ob = new Pattern3();
        ob.display();
    }

    public void display() {
        int i, j, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}