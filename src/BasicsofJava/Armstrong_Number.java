//package BasicsofJava;
//import java.util.Scanner;
//public class Armstrong_Number {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number :-");
//        int Num = sc.nextInt();
//        int original = Num;
//        int result = 0;
//        while (Num>0){
//            int digit = Num%10;
//            result = result + (digit * digit * digit);  // Check only three digits Number.
//            Num = Num / 10;
//        }if(result==original){
//            System.out.println(original+" is an Armstrong Number...");
//        }else{
//            System.out.print(original+" is not an Armstrong Number...");
//        }
//        sc.close();
//    }
//}


package BasicsofJava;
import java.util.Scanner;
    public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);    // Check any digit number are armstrong or not.
            num /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        sc.close();
        }
}