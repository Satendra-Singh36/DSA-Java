package BasicJava;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a selling prize :- ");
        int sp = sc.nextInt();

        System.out.print("Enter a cost prize :- ");
        int cp = sc.nextInt();

        if(sp > cp){
            System.out.println("You Gain Profit...");
        }else if(cp > sp){
            System.out.println("You Gain Loss... ");
        }else {
            System.out.print("No Profit No Loss...");
        }
    }
}
