// Method (1) :- Using Extra Array
//package Arrays;
//import java.util.Scanner;
//public class ReverseArray{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size = ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter array elements = ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] arr1 = new int[n];
//        int j = 0;
//        for(int i = n - 1; i >= 0; i--){
//            arr1[j] = arr[i];
//            j++;
//        }
//        for (int ele : arr1){
//            System.out.print(ele + " ");
//        }
//    }
//}

// Method (2) Two Pointer
package Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + "  ");
        }
    }
}

