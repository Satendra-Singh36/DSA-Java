//package BasicsofJava;
//import java.util.Scanner;
//public class characterArrayInput {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :- ");
//        int n = sc.nextInt();
//
//        char[] arr = new char[n];
//
//        System.out.print("Enter a charater :- ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.next().charAt(0);
//        }
//        System.out.print("Character array = ");
//        for(char c : arr){
//            System.out.print(c + " ");
//        }
//    }
//}

// Print null character array :-
package BasicsofJava;
import java.util.Scanner;
public class characterArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        for(char c : arr){
            System.out.print(c + " ");
        }
    }
}
