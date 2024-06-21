import java.util.Scanner;

public class Set1_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 Row Size : ");
        int r1 = sc.nextInt();
        System.out.print("Enter 1 Col SIze : ");
        int c1 = sc.nextInt();

        System.out.print("Enter 2 Row Size : ");
        int r2 = sc.nextInt();
        System.out.print("Enter 2 Col SIze : ");
        int c2 = sc.nextInt();

        if(c1==r2)
        {
            int arr1[][] = new int[r1][c1];
            int arr2[][] = new int[r2][c2];

            System.out.println("Enter value for matrix 1 : \n");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print("Enter value for " + i + "[" + j + "] : ");
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter value for matrix 2 : \n");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print("Enter value for " + i + "[" + j + "] : ");
                    arr2[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nMatrix 1 : \n");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nMatrix 2 : \n");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }

            int arr3[][] = new int[r1][c2];

            for(int i=0;i<r1;i++)
            {
                int v=0;
                for(int j=0;j<c2;j++)
                {
                    int mul[] = new int[c1],x=0;
                    for(int k=0;k<c1;k++)
                    {
                        mul[k] = arr1[i][x] * arr2[x][v];
                        x++;
                    }

                    int ans=0;
                    for(int k=0;k<c1;k++)
                    {
                        ans += mul[k]; 
                    }

                    arr3[i][j] = ans;
                    v++;
                }
            }

            System.out.println("\nMatrix 3 : \n");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Row 1 and Col 2 is not same so Matrix Multiplication is not possible");
        }
    }
}
