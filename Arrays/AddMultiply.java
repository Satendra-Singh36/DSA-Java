//  Multiply odd indexed elements by
//  2 and add 10 to even indexed elements?
package Arrays;
import java.util.Scanner;
public class AddMultiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                arr[i] = arr[i] * 2;
            }else {
                arr[i] = arr[i] + 10;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

