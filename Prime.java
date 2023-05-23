import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check Prime or Not : ");
        int number = scanner.nextInt();

        int i = 2, j = 0;
        while (i <= number / 2) {

            if (number % i == 0) {
                j++;
                break;
            }
            i++;
        }
        if (j == 0) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
