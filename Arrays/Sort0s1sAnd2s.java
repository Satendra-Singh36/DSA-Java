// Method (1)
package Arrays;
import java.util.Scanner;
public class Sort0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {  // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

// Method (2)
//package Arrays;
//import java.util.Scanner;
//public class Sort0s1sAnd2s {
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
//
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        for(int ele : arr){
//            if(ele == 0){
//                count0++;
//            }
//            else if(ele == 1) {
//                count1++;
//            }
//            else {
//                count2++;
//            }
//        }
//
//        int k = 0;
//        while(count0 > 0){
//            arr[k++] = 0;
//            count0--;
//        }
//        while(count1 > 0) {
//            arr[k++] = 1;
//            count1--;
//        }
//        while(count2 > 0){
//            arr[k++] = 2;
//            count2--;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}