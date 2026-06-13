package PatternPrinting;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i = 1; i <= n; i++){   // rows
            for(int j = 1; j <= nsp; j++){  // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= nst; k++){   // stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nst = 2*n-3;
        nsp = 1;
        for(int i = 1; i <= n-1; i++){   // rows
            for(int j = 1; j <= nsp; j++){  // spaces
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= nst; k++){   // stars
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }
}
