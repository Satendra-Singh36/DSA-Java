//package BasicsofJava;
//import java.util.Scanner;
//public class ap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :- ");
//        int n = sc.nextInt();
//        for(int i=1; i<=(2*n-1); i+=2){   // 1 3 5 7...
//            System.out.print(i+" ");
//        }
//    }
//}

//package BasicsofJava;
//import java.util.Scanner;
//public class ap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :- ");
//        int n = sc.nextInt();
//        for(int i=4; i<=(3*n+1); i+=3){  // 4 7 10 13....  a=4,d=3   a+(n-1).d
//            System.out.print(i+" ");
//        }
//    }
//}

// Very Useful Method without find nth term :-
package BasicsofJava;
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        int a=3, d=4;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");  // 3 7 11 15 19
            a = a+d;
        }
    }
}