// Method (1)
//package Arrays;
//import java.util.Scanner;
//public class AddingOne {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size = ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.print("Enter array elements = ");
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = n - 1; i >= 0; i--) {
//            if(arr[i] < 9) {
//                arr[i]++;
//                for(int ele : arr) {
//                    System.out.print(ele + " ");
//                }
//                return;
//            }
//            arr[i] = 0;
//        }
//
//        int[] a = new int[n + 1];
//        a[0] = 1;
//
//        for(int ele : a) {
//            System.out.print(ele + " ");
//        }
//    }
//}

//Method (2)
package Arrays;
import java.util.ArrayList;
import java.util.*;
public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for(int i = n - 1; i >= 0; i--){
            int sum = arr[i] + carry;
            if(sum <= 9){
                ans.add(sum);
                carry = 0;
            }
            else{ // arr[i] + carry = 10
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        System.out.print(ans);
    }
}