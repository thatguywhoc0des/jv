import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nFor Adition press 1");
        System.out.println("For Substraiction press 2");
        System.out.println("For Multiplication press 3");
        System.out.println("For Devision press 4");
        System.out.println("For Exit press 5");
        do {

            System.out.print("\n\nEnter a Choice : ");
            op = sc.nextInt();
            System.out.print("\n\nEnter 1st Number = ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number = ");
            int b = sc.nextInt();

            int sum = a + b, mul = a * b, sub = a - b, div = a / b;

            switch (op) {
                case 1:
                    System.out.print("\n" + a + " + " + b + " = " + sum);
                    break;

                case 2:
                    System.out.print("\n" + a + " - " + b + " = " + sub);
                    break;

                case 3:
                    System.out.print("\n" + a + " x " + b + " = " + mul);
                    break;

                case 4:
                    System.out.print("\n" + a + " / " + b + " = " + div);
                    break;
                default:
                    System.out.print("You Entered Wrong Choice...!");
                    break;
            }
        } while (op != 5);
    }

}
