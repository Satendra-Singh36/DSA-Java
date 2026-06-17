package BasicJava;
import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side of Square :- ");
        int side = sc.nextInt();

        int Area_of_Square = side * side;

        System.out.print("The Area of Square is :- ");
        System.out.print(Area_of_Square);
    }
}
