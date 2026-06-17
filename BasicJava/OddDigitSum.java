package BasicJava;
import java.util.Scanner;
public class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int N = sc.nextInt();

        int sum = 0;
        while (N != 0){
            int rem = N % 10;
            if(rem % 2 != 0){
                sum = sum + rem;
            }
            N = N / 10;
        }
        System.out.print("Odd Digits Sum = " + sum);
    }
}
