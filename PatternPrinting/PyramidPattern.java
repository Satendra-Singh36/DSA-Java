// Method (1)
//package PatternPrinting;
//import java.util.Scanner;
//public class PyramidPattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){   // rows
//            for(int j = 1; j <= n-i; j++){  // spaces
//                System.out.print(" " + " ");
//            }
//            for(int k = 1; k <= (2*i)-1; k++){   // stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

// Method (2)
package PatternPrinting;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i = 1; i <= n; i++){   // rows
            for(int j = 1; j <= nsp; j++){  // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= nst; k++){   // stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}
