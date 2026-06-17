package BasicJava;
import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();        // 1 2 4 8 16 32 64 128 256 512 1024....n term
        int a = 1, r = 2;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
    }
}
