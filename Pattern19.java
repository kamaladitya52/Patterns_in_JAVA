import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows - ");
        int row = sc.nextInt();
        int count = 1;
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            count++;
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
