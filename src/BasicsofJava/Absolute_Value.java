package BasicsofJava;
import java.util.Scanner;
public class Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer :- ");
        int Num = sc.nextInt();
        if(Num<0) {
            Num = Num * (-1);
        }
        System.out.print("The Absolute Value is : "+Num);
    }
}
