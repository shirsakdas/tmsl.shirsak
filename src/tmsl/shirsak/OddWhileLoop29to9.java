package tmsl.shirsak;

class OddWhileLoop29to9 {
    public static void main(String args[]) {
        System.out.println("All odd numbers from 29 to 9 are:");
        int i = 29;
        while (i >= 9) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}