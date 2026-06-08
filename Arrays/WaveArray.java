// Given Input is Always sorted
//package Arrays;
//import java.util.Scanner;
//public class WaveArray{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size = ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.print("Enter array elements = ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n - 1; i = i + 2){
//            int j = i + 1;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            j += 2;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}

// Method (2)
package Arrays;
import java.util.Scanner;
public class WaveArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}