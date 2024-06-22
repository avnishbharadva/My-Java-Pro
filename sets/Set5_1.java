import java.util.Scanner;

public class Set5_1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        int ans = factorial(num);

        System.out.println("Factorial of " + num + " is : " + ans);
    }    
    public static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            int res = num * factorial(num-1);
            return res;
        }
    }
}
