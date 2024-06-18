import java.util.Scanner;

public class Transpose_of_matrix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Size : ");
        int row = sc.nextInt();
        System.out.print("Enter Column Size : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        int temp = 1;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = temp++;
            }
        }

        System.out.println("Normal Matrix\n");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Of a Matrix\n");

        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
