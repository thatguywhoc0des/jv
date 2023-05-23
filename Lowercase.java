import java.util.Scanner;

public class Lowercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character = ");

        // String x = sc.nextLine();
        
        char x = sc.next().charAt(0);

        if (x >= 'a' && x <= 'z') {
            System.out.println(x + " is Lowercase Char.");
        }

        else {

            System.out.println(x + " is Uppercase Char.");
        }
    }

}
