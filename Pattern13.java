import java.util.Scanner;

/*
         1
        212
       32123
      4321234
     543212345
 */
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows - ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            for (int j = 1; j <= row - i; j++)
                System.out.print(" ");
            System.out.println();
        }

        sc.close();

    }
}
