package BasicJava;
import java.util.Scanner;
public class ThreeDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int N = sc.nextInt();

        if(N > 99 && N < 1000){
            System.out.print("The Given Number is 3 Digit...");
        }else{
            System.out.print("The Given Number is Not 3 Digit...");
        }
    }
}
