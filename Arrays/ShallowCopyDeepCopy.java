//package Arrays;
//public class ShallowCopyDeepCopy {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40};
//        int[] x = arr;  // x is Shallow-copy of arr
//        x[0] = 100;
//        System.out.println(arr[0]);
//        System.out.println(x[0]);
//    }
//}

// Deep Copy
package Arrays;
import java.util.*;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(arr[0]);
        System.out.println(y[0]);
    }
}
