import java.util.Scanner;

public class Set6_1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range of prime num : ");
        int n = sc.nextInt();

        prime_n(n);
    }    
    public static void prime_n(int n)
    {
        System.out.print(2 + " ");

        for(int i=3;i<=n;i++)
        {
            boolean temp = false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp = true;
                    break;
                }
            }
            if(temp==false)
                System.out.print(i + " ");
        }
    }
}
