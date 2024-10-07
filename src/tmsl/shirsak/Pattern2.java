package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
 * * * * *
 * * * *
 * * *
 * *
 *
 */
class Pattern2 {
    public static void main(String args[]) {
        Pattern2 ob = new Pattern2();
        ob.display();
    }

    public void display() {
        int i, j, n = 5;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}