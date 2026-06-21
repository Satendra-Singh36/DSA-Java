package BasicJava;
import java.util.Scanner;
public class RectangleAreaOrPerimeter {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a length of rectangle:- ");
            int length = sc.nextInt();

            System.out.print("Enter a width of rectangle:- ");
            int width = sc.nextInt();

            int Area = length * width;
            System.out.println("Area = " + Area);

            int Perimeter = 2 * (length + width);
            System.out.println("Perimeter = " + Perimeter);

            if(Area > Perimeter){
                System.out.print("The Area is Greater than Perimeter = " + Area);
            }else if(Perimeter > Area){
                System.out.print("The Perimeter is Greater than Area = " + Perimeter);
            }else if(Area == Perimeter){
                System.out.println("Area and Perimeter are Equal");
            }
    }
}
