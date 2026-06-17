package BasicJava;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year :- ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.print(year+" The Given year is Leap Year...");
        }else{
            System.out.print(year+" The Given year is Not Leap Year...");
        }
    }
}
