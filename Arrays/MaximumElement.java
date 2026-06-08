package Arrays;
import java.util.Scanner;
public class MaximumElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(max < ele){
                max = ele;
            }
        }
        System.out.print("Max = " + max);
    }
}
