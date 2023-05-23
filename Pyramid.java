public class Pyramid {
    public static void main(String[] args) {
        int i, j, k = 5;

        for (i = 0; i <= 5; i++) { // Pyramid 1

        for (j = 0; j <= i; j++) {

        System.out.print("* ");
        }
        System.out.print("\n");
        }
        System.out.print("\n\n");


        for (i = 0; i <= 5; ++i) {     // Pyramid 2

        for (j = i; j <= 5; ++j) {

        System.out.print("* ");
        }
        System.out.print("\n");
        }

        System.out.print("\n");

        int n = 6;
        int z = 2 * n - 2;

        for (int x = n; x > 0; x--) {      // Pyramid 3

            for (int y = 0; y < n - x; y++)
                System.out.print("  ");

            k = k - 2;

            for (int y = 0; y < x; y++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
