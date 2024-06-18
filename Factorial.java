import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        no = sc.nextInt();

        Factorial obj = new Factorial();
        // int fact = obj.factorial_calc(no);
        int fact = obj.factorial_calc_recursion(no);
        
        System.out.println("Factorial of " + no + " is " + fact);
        sc.close();
    }   

    public int factorial_calc(int no)
    {
        int ans = 1;
        for(int i=no;i>=1;i--)
        {
            ans = ans * i;
        }
        return ans;
    }

    public int factorial_calc_recursion(int no)
    {
        if(no==1)
            return 1;
        else {
            int ans = no * factorial_calc_recursion(no - 1);
            return ans;
        }
    }
}