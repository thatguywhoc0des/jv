public class Palindrome {
    public static void main(String[] args) {

        int num = 1221;
        int revnum = 0;
        int remainder;
        int originalnum = num;
        while (num != 0) {

            remainder = num % 10;
            revnum = revnum * 10 + remainder;
            num = (num / 10);

        }

        if (originalnum == revnum) {

            System.out.print("\n" + originalnum + " is Palindrome Number.");
        }

        else {

            System.out.print("\n" + originalnum + " is not a Palindrome Number.");
        }

    }

}
