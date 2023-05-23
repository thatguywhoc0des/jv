import java.util.*;

public class IntegerOrAvg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0;
        float avg;

        System.out.print("\nEnter 10 Integer values.\n");

        for (i = 1; i <= 10; i++) {

            n = sc.nextInt();
            sum += n;

        }
        avg = sum / 10;

        System.out.print("The sum is = " + sum + "\nThe avg is = " + avg);

    }
}
