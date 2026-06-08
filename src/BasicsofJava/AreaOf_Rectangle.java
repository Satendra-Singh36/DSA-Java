package BasicsofJava;
import java.util.Scanner;
public class AreaOf_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of rectangle:- ");
        int length = sc.nextInt();
        System.out.print("Enter a width of rectangle:- ");
        int width = sc.nextInt();
        int Area = length * width;
        System.out.println(Area);
        int Perimeter = 2 * (length + width);
        System.out.println(Perimeter);
        if(Area>Perimeter){
            System.out.print("The Area is Greater than Perimeter = " + Area);
        }if(Perimeter>Area){
            System.out.print("The Perimeter is Greater than Area = " + Perimeter);
        }if(Area==Perimeter){
            System.out.println("Area and Perimeter are Equal ");
        }
    }
}
