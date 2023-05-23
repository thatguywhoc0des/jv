public class Continue {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            if (i == 3) {

                continue; // It will Skip 3.
            }

            System.out.println("I = " + i);

        }
    }

}
