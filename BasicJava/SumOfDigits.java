package BasicJava;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int N = sc.nextInt();

        int sum = 0;
        while (N > 0){
            int rem = N % 10;
            sum = sum + rem;
            N = N / 10;
        }
        System.out.print("Sum = " + sum);
    }
}
