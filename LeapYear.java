import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Year : ");

        int a = sc.nextInt();

        if (a % 4 == 0 && a % 100 != 0) {

            System.out.print(a + " is The Leap Year.");
        } else if (a % 400 == 0) {

            System.out.print(a + " is The Leap Year.");
        } else {
            System.out.print(a + " is Not a Leap Year.");
        }

    }

}
