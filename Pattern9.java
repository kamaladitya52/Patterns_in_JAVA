
/* 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 
*/
import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");

            }
            System.out.println();
        }
        sc.close();
    }
}
