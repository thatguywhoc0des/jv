import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tEnter The Marks Of A Student.\n\n");

        System.out.print("JAVA = ");
        int b = sc.nextInt();

        System.out.print("COA = ");
        int c = sc.nextInt();

        System.out.print("HTML = ");
        int d = sc.nextInt();

        System.out.print("DCN = ");
        int e = sc.nextInt();

        System.out.print("PSACC = ");
        int f = sc.nextInt();

        int total = (b + c + d + e + f);
        float per = (total / 5);

        if (per <= 100 && per >= 80) {
            System.out.println(per + " is  A ");
        }

        else if (per <= 80 && per >= 60) {
            System.out.println(per + " is  B ");
        }

        else if (per <= 60 && per >= 50) {
            System.out.println(per + " is  C ");
        }

        else if (per <= 50 && per >= 45) {
            System.out.println(per + " is  D ");
        }

        else if (per <= 45 && per >= 25) {
            System.out.println(per + " is  E ");
        }

        else if (per <= 25 && per >= 0) {
            System.out.println(per + " is  F ");
        } else {

            System.out.println(per + " The Student is Fail...! ");
        }
    }

}
