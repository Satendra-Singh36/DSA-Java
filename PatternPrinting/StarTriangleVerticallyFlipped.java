// Method (1)  Treat as a square
//package PatternPrinting;
//import java.util.Scanner;
//public class StarTriangleVerticallyFlipped {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if((i + j) > n){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// Method (2) Ek loop ke andar 2 loop
package PatternPrinting;
import java.util.Scanner;
public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){  // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= i; k++){   // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}