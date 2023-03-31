import java.util.Scanner;

/*

     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

 */
public class Pattern17 {
    public int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Pattern17 p = new Pattern17();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows - ");
        int row = sc.nextInt();
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + p.factorial(i) / (p.factorial(i - j) * p.factorial(j)));
            }
            System.out.println();
        }
        sc.close();
    }

}