//package Arrays;
//import java.util.Scanner;
//public class MissingElement{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size = ");
//        int n = sc.nextInt();
//        int nSum = n * (n + 1) / 2;
//        System.out.println("N natural numbers Ka sum = " + nSum);
//        int[] arr = new int[n-1];
//        System.out.print("Enter array elements = ");
//        for(int i = 0; i < n - 1; i++){
//            arr[i] = sc.nextInt();
//        }
//        int arraySum = 0;
//        for(int i = 0; i < n-1; i++){
//            arraySum = arraySum + arr[i];
//        }
//        int finalSum = nSum - arraySum;
//        System.out.print("Missing Number = " + finalSum);
//    }
//}


package Arrays;
public class MissingElement {
    public static void main(String[] args) {
        int n = 5; // Numbers should be from 1 to 5
        int[] arr = {1, 2, 3, 5};
        int nSum = n * (n + 1) / 2;
        int arraySum = 0;

        for(int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        int missingNumber = nSum - arraySum;
        System.out.println("Missing Number = " + missingNumber);
    }
}