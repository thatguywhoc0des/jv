import java.util.Scanner;

public class Divisible57 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");

        int x = sc.nextInt();

        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println(x + " is divisible with 5 and 7.");
        }

        else {

            System.out.println(x + " is not Divisible.");
        }
    }

}
