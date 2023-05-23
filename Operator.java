import java.util.Scanner;

public class  Operator{

    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.print("Enter a = ");
        int x = ab.nextInt();

        System.out.print("\nEnter b = ");
        int y = ab.nextInt();

        System.out.println("a + b = " + (x + y));
        System.out.println("a - b = " + (x - y));
        System.out.println("a * b = " + (x * y));
        System.out.println("a / b = " + (x / y));

    }

}
