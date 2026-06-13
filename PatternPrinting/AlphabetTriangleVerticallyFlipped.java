//package PatternPrinting;
//import java.util.Scanner;
//public class AlphabetTriangleVerticallyFlipped {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n - i; j++){ // spaces
//                System.out.print(" " + " ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print((char)(i + 64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}


package PatternPrinting;
import java.util.Scanner;
public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print((char)(k + 64) + " ");
            }
            System.out.println(Math.cbrt(100));
        }
    }
}
