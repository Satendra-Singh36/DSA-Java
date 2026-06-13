package PatternPrinting;
import java.util.Scanner;
public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){   // rows
            for(int j = 1; j <= n-i; j++){  // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= n; k++){   // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//package PatternPrinting;
//import java.util.Scanner;
//public class RhombusPattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){   // rows
//            for(int j = 1; j < i; j++){  // spaces
//                System.out.print(" " + " ");
//            }
//            for(int k = n; k >= i; k--){   // stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}