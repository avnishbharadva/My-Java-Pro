import java.util.Scanner;

public class Set13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Size : ");
        int r = sc.nextInt();
        System.out.print("ENter Col Size : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter value for a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
