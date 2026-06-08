//package BasicsofJava;
//import java.util.Scanner;
//public class ArmstrongNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int Num = sc.nextInt();
//        int original = Num;
//        int result = 0;
//        while (Num > 0) {
//            int digit = Num % 10;
//            result = result + (digit * digit * digit);  // Check only three digits Number.
//            Num = Num / 10;
//        }
//        if (result == original) {
//            System.out.println("ArmstrongNumber");
//        } else {
//            System.out.print("Not Armstrong");
//        }
//    }
//}

package BasicsofJava;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int len = 0;
        while (x != 0){
            len++;
            x = x/10;
        }
        x = n;
        double sum = 0;
        while (x != 0){
            int d = x % 10;
            sum = sum + Math.pow(d,len);
        }if (sum == x){
            System.out.println("Armstrong");
        }
    }
}
