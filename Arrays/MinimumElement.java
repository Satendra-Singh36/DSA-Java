package Arrays;
import java.util.Scanner;
public class MinimumElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int ele : arr){
            if(min > ele){
                min = ele;
            }
        }
        System.out.print("Min = " + min);
    }
}
