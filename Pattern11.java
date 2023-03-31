import java.util.Scanner;

/*

     ***** 
    *****
   *****
  *****
 ***** 

 */
public class Pattern11 {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows - ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++)
                System.out.print(" ");
            for (int j = row; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}