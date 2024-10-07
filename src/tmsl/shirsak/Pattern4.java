package tmsl.shirsak;/*The Pattern will be as follows: (if n=5)
1 1 1 1 1
1 1 1 2 2
1 1 3 3 3
1 4 4 4 4
5 5 5 5 5
*/

import java.util.*;

class Pattern4 {
    public static void main(String[] args) {
        Pattern4 ob = new Pattern4();
        ob.pattern();
    }

    public int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public void pattern() {
        int n = input();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("1 ");
            }
            for (int k = (n - i - 1); k < n; k++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}


/*The Pattern will be as follows: (if n=5)
1 1 1 1 1
1 1 1 2 2
1 1 3 3 3
1 4 4 4 4
5 5 5 5 5
*/

/*import java.util.*;

class Pattern4 {
    public int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public void pattern() {
        for (int i = 0; i < input(); i++) {
            for (int j = 0; j < (input() - i - 1); j++) {
                System.out.print("1 ");
            }
            for (int k = (input() - i - 1); k < input(); k++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 ob = new Pattern4();
        ob.pattern();
    }
}*/