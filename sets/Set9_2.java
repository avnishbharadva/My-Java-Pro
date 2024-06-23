import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Set9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int r = sc.nextInt();

        List<Integer> pre = new ArrayList<Integer>();

        for(int i=0;i<r;i++)
        {
            List<Integer> row = new ArrayList<Integer>();

            for(int j=i;j<r;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    System.out.print("1 ");
                    row.add(1);
                }
                else
                {
                    System.out.print(pre.get(j-1) + pre.get(j) + " ");
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }

            // System.out.println(row);
            pre = row;
            System.out.println();
            // System.out.println(pre);
        }
    }    
}
