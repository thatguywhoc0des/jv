import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");

        int x = sc.nextInt();

        if (x > 0) {
            System.out.println(x + " is Positive Number.");
        }

        else if (x < 0) {

            System.out.println(x + " is Negative Number. ");
        }

        else {

            System.out.println(x + " is zero.");
        }
    }

}
