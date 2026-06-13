package PatternPrinting;
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows = ");
        int row = sc.nextInt();
        System.out.print("Enter columns = ");
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


//// Star Square
//package PatternPrinting;
//import java.util.Scanner;
//public class StarRectangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
//}
