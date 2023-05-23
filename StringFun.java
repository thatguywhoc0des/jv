import java.util.Scanner;

public class StringFun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");

        String x = sc.nextLine();

        System.out.print("\nString Length is : " + x.length()); 

        System.out.print("\n\nString is in Upper Case : " + x.toUpperCase()); 

        System.out.print("\n\nString is Lower Case: " + x.toLowerCase()); 

    }

}
