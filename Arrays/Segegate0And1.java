// Segregate 0s and 1s
// Given Input only 0 and 1;
// Method (1)
//package Arrays;
//import java.util.Scanner;
//public class Segegate0And1{
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
//        int noz = 0;
//        for(int i = 0; i < n; i++){
//            if(arr[i] == 0){
//                noz++;
//            }
//        }
//        for(int i = 0; i < noz; i++){
//            arr[i] = 0;
//        }
//        for(int i = noz; i < n; i++){
//            arr[i] = 1;
//        }
//        for (int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}

// Enter array size = 12
// Enter array elements = 1 0 0 1 1 1 0 1 0 1 1 0
// Output = 0 0 0 0 0 1 1 1 1 1 1 1

// Method (2)
package Arrays;
import java.util.Scanner;
public class Segegate0And1{
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
        int j = arr.length - 1;
        while (i < j){
            if(arr[i] == 0){
                i++;
            }else if(arr[j] == 1){
                j--;
            }else if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}