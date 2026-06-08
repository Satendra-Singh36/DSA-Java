package Arrays;
import java.util.Scanner;
public class SecondMaximum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int ele : arr){
            if(firstMax < ele){
                firstMax = ele;
            }
        }
        for (int ele : arr){
            if(ele > secondMax && ele != firstMax){
                secondMax = ele;
            }
        }
        System.out.print(firstMax + " " + secondMax);
    }
}
