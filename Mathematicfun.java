import java.util.*;

public class Mathematicfun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextInt();

        float b = sc.nextInt();

        // System.out.print("Minimum Number is : ");

        System.out.println("Minimum is : " + Math.min(a, b));

        System.out.println("Maximum is : " + Math.max(a, b));

        System.out.println("Sqrt is : " + Math.sqrt(a));

        System.out.println("Random no. is : " + Math.random());

    }

}