//package Arrays;
//public class Merge2SortedArray{
//    public static void main(String[] args) {
//        int[] a = {2,5,6,9,20};
//        int[] b = {1,3,4,5,7,8,90};
//
//        int[] c = new int[a.length+b.length];
//        for(int ele : c) System.out.print(ele+" ");
//        System.out.println();
//        merge(c,a,b);
//        for(int ele : c) System.out.print(ele+" ");
//        System.out.println();
//    }
//
//    public static void merge(int[] c, int[] a, int[] b) {
//        int i=0,j=0,k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        while(i<a.length) c[k++] = a[i++];
//        while(j<b.length) c[k++] = b[j++];
//
//    }
//}


package Arrays;
import java.util.Scanner;
public class Merge2SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size = ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter first array elements = ");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter second array size = ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.print("Enter second array elements = ");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2) {

            if(arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        System.out.print("Merged Array = ");

        for(int ele : result) {
            System.out.print(ele + " ");
        }
    }
}