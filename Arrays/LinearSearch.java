package Arrays;
import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = -1;
        int found = -789; // -789 means target array me nahi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found = i; // any no. except -1 means target array me hai
                break;
            }
        }
        if(found != -789){
            System.out.println("Target exists in Array at index "+found);
        }
        else{
            System.out.println("Target missing in Array");
        }

    }
}