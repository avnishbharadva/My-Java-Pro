import java.util.Scanner;

public class Set10_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range of prime no : ");
        int no = sc.nextInt();

        int sum = 2;
        
        for(int i=3;i<=no;i++)
        {
            boolean t = false;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    // System.out.print(i + " ");
                    t = true;
                    break;
                }
            }
            if(t==false)
            {
                sum += i;
                // System.out.print(i + " ");
            }
        }

        System.out.println("Sum of prime no : " + sum);
    }    
}
