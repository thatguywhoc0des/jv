import java.util.Scanner;

public class Profit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price = ");

        int cp = sc.nextInt();

        System.out.print("Enter selling Price = ");

        int sp = sc.nextInt();

        int loss = cp - sp;

        int profit = sp - cp;
        int pfp = (profit * 100) / cp;

        if (cp > sp) {
            System.out.println(loss + "% Loss...!");
        }

        else {

            System.out.println(pfp + "% Profit....!");
        }
    }
}
