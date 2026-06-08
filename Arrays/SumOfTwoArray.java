//package Arrays;
//import java.util.Scanner;
//public class SumOfTwoArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first array size = ");
//        int n1 = sc.nextInt();
//        int[] arr1 = new int[n1];
//
//        System.out.print("Enter first array elements = ");
//        for(int i = 0; i < n1; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter second array size = ");
//        int n2 = sc.nextInt();
//        int[] arr2 = new int[n2];
//
//        System.out.print("Enter second array elements = ");
//        for(int i = 0; i < n2; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
//        int[] sum = new int[Math.max(n1, n2)];
//
//        int i = n1 - 1;
//        int j = n2 - 1;
//        int k = sum.length - 1;
//
//        int carry = 0;
//
//        while(k >= 0) {
//
//            int digit = carry;
//
//            if(i >= 0) digit += arr1[i];
//            if(j >= 0) digit += arr2[j];
//
//            sum[k] = digit % 10;
//            carry = digit / 10;
//
//            i--;
//            j--;
//            k--;
//        }
//
//        System.out.print("Sum = ");
//
//        if(carry > 0) {
//            System.out.print(carry + " ");
//        }
//
//        for(int ele : sum) {
//            System.out.print(ele + " ");
//        }
//    }
//}

package Arrays;
import java.util.*;
public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size = ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter first array elements = ");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter second array size = ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.print("Enter second array elements = ");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        int i = n1 - 1;
        int j = n2 - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i >= 0) sum += arr1[i--];
            if(j >= 0) sum += arr2[j--];

            result.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(result);

        System.out.print("Sum = ");
        for(int digit : result) {
            System.out.print(digit + " ");
        }
    }
}