package BasicJava;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius = ");
        double radius = sc.nextDouble();
        double PI = 3.14159;
        double Area_of_Circle = PI * radius * radius;
        System.out.println("The area of circle is: " + Area_of_Circle);
    }
}
