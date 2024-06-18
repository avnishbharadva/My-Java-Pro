public class Fibonacci {
    public static void main(String args[])
    {
        fibonacci_series(0,1,15);
        fibonacci(20);
    }

    // using recursion
    public static void fibonacci_series(int f, int s, int n)
    {
        if(n==1)
        {
            System.out.println(f);
        }
        else
        {
            System.out.print(f + " ");
            fibonacci_series(s, f+s, n-1);
        }
    }

    // using normal for loop
    public static void fibonacci(int size)
    {
        int n1 = 0;
        int n2=1,n3=n1+n2;
        for(int i=size;i>=1;i--)
        {
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
