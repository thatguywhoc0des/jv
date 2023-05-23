import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int num, input, remainder, result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Three Integer value : ");

        input = sc.nextInt();
        num = input;
        while (num != 0) {

            remainder = num % 10;

            result += remainder * remainder * remainder;
            num /= 10;

        }

        if (result == input) {
            System.out.print(input + " This is Armstrong no.!");
        } else {
            System.out.print(input + " This is Not an Armstrong number.");
        }
    }

}
