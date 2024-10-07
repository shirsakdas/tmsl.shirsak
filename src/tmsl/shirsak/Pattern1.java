package tmsl.shirsak;

/*The Pattern will be as follows: (if n=5)
 *
 * *
 * * *
 * * * *
 * * * * *
 */
class Pattern1 {
    public static void main(String[] args) {
        Pattern1 ob = new Pattern1();
        ob.display();
    }

    public void display() {
        int i, j, n = 10;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}