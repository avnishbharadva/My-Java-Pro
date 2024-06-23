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

            System.out.println("Matrix 1\n");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print("Enter value for " + i + " : ");
                    a1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix 2\n");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print("Enter value for " + i + " : ");
                    a2[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    a3[i][j] = a1[i][j] + a2[i][j];
                }
            }

            System.out.println("Addition of Matrix\n");

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(a3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Matrix addition not possible");
        }
    }    
}
