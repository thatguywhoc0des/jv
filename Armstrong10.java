public class Armstrong10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            int num, remainder, result = 0;

            num = i;

            while (num != 0) {

                remainder = num % 10;

                result += remainder * remainder * remainder;
                num /= 10;

            }

            if (result == i) {
                System.out.println(i + " This is Armstrong no.!");
            }
        }
    }
}
