package BasicsofJava;
import java.util.Scanner;
public class Adom_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        // Reverse of number
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
//        System.out.println(rev);
        // Square of number and square of reversed number
        int squareNum = num * num;
        int squareRev = rev * rev;

        // Reverse of square of reversed number
        int revSquareRev = 0;
//        System.out.println(squareRev);
        while (squareRev > 0) {
            int digit = squareRev % 10;
            revSquareRev = revSquareRev * 10 + digit;
            squareRev = squareRev / 10;
        }
//        System.out.println(squareNum);
//        System.out.println(revSquareRev);

        // Check if Adam number
        if (squareNum == revSquareRev) {
            System.out.println(num + " is an Adam Number.");
        } else {
            System.out.println(num + " is not an Adam Number.");
        }
        sc.close();
    }
}
