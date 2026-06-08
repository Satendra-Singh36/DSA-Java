package Arrays;
import java.util.Scanner;
public class ArrayProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int ele : arr){
             product = product * ele;
        }
        System.out.print("Product = " + product);
    }
}
