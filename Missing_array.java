import java.util.Scanner;

public class Missing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter size : ");
        int n = sc.nextInt();

        int a[] = new int[n-1];

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter value : ");
            a[i] = sc.nextInt();
        }

        for(int i=1;i<=n;i++)
        {
            boolean found = false;

            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i)
                {
                    found = true;
                    break;
                }
            }
            if(found==false)
                System.out.print(i + " ");
        }
    }
}
