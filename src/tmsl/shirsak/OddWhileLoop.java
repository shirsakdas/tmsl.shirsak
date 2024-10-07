package tmsl.shirsak;

class OddWhileLoop {
    public static void main(String args[]) {
        System.out.println("All odd numbers from 1 to 19 are:");
        int i = 1;
        while (i <= 19) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}