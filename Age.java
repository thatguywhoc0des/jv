import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Age of Brijesh = ");
        int x = ab.nextInt();

        System.out.print("Age of Harsh = ");
        int y = ab.nextInt();

        System.out.print("Age of Khushboo = ");
        int z = ab.nextInt();

        if (x > y && x > z) {
            System.out.println("Brijesh is Oldest.");
        }

        else if (y > x && y > z) {

            System.out.println("Harsh is Oldest. ");
        }

        else {

            System.out.println("Khushboo is Oldest.");
        }
    }

}