import java.util.Scanner;

public class Set11_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int s = sc.nextInt();

        int a[] = new int[s];

        for(int i=0;i<s;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            a[i] = sc.nextInt();
        }

        for(int i=s-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }    
}
