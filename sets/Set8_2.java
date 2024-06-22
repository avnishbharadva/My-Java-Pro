import java.util.Scanner;

public class Set8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row 1 size : ");
        int r1 = sc.nextInt();
        System.out.print("Enter col 1 size : ");
        int c1 = sc.nextInt();
        System.out.print("Enter row 2 size : ");
        int r2 = sc.nextInt();
        System.out.print("Enter col 2 size : ");
        int c2 = sc.nextInt();

        if(r1==r2 && c1==c2)
        {
            int a1[][] = new int[r1][c1];
            int a2[][] = new int[r2][c2]; 
            int a3[][] = new int[r1][c1];

            System.out.println();
        }
        else
        {
            System.out.println("Matrix addition not possible");
        }
    }    
}
