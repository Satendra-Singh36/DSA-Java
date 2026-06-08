// Left Rotation (Counter-Clockwise Rotation)
//package Arrays;
//import java.util.Scanner;
//public class RotateArray {
//    public static void reverse(int[] arr, int i, int j) {
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size = ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.print("Enter array elements = ");
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter d = ");
//        int d = sc.nextInt();
//
//        d = d % n;
//        // Left Rotate by d positions
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//        reverse(arr, 0, n - 1);
//
//        System.out.print("Rotated Array = ");
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//}

// Left Rotation (Without User Input, With Method)
//package Arrays;
//public class RotateArray {
//    public static void reverse(int[] arr, int i, int j) {
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int d = 2;
//
//        int n = arr.length;
//        d = d % n;
//
//        // Left Rotation
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//        reverse(arr, 0, n - 1);
//
//        System.out.print("Rotated Array = ");
//
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//}


// Right Rotation Using Reversal Algorithm
//package Arrays;
//import java.util.Scanner;
//
//public class RotateArray {
//
//    public static void reverse(int[] arr, int i, int j) {
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
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
//        System.out.print("Enter d = ");
//        int d = sc.nextInt();
//
//        d = d % n;
//
//        // Right Rotation
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//
//        System.out.print("Rotated Array = ");
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//}

//
//package Arrays;
//public class RotateArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int d = 2;
//
//        int n = arr.length;
//        d = d % n;
//
//        // Reverse first part
//        int i = 0;
//        int j = d - 1;
//
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//
//        // Reverse second part
//        i = d;
//        j = n - 1;
//
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//
//        // Reverse whole array
//        i = 0;
//        j = n - 1;
//
//        while(i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.print("Rotated Array = ");
//
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }
//    }
//}

// Right Rotation (Without User Input, With Method)
package Arrays;
public class RotateArray {
    public static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        int n = arr.length;
        d = d % n;

        // Right Rotation
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);

        System.out.print("Rotated Array = ");

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}