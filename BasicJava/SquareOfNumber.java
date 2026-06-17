package BasicJava;
import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n  = sc.nextInt();

        double square = n * n;
        System.out.print("Square = " + square);
    }
}
