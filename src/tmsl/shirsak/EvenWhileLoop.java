package tmsl.shirsak;

class EvenWhileLoop {
    public static void main(String args[]) {
        System.out.println("All even numbers from 2 to 20 are:");
        int i = 2;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}