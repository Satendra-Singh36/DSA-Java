package BasicJava;
import java.util.Scanner;
public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= 10) {
            int Table = n * i;
            i = i + 1;
            System.out.println(Table);
        }
    }
}
