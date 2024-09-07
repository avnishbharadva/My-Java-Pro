import java.util.Scanner;

public class Factrec {
    static{
        System.out.println("kdfkek");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();

        int ans = fact(n);

        System.out.println("Factorial : " + ans);
        sc.close();
    }    
    public static int fact(int n)
    {
        if(n==1)
            return 1;
        int ans = n * fact(n-1);
        return ans;
    }
}
