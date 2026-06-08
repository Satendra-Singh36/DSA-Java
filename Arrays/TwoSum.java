package Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target = ");
        int target = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("No Pair Found");
    }
}