
/* 
 **************
 **************
 **************
 **************
*/
import java.util.*;
import java.util.Scanner;

class Pattern1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int row = scan.nextInt();
        System.out.print("Enter Number of Columns : ");
        int column = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}