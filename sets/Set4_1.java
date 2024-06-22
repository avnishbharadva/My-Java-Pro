public class Set4_1 {
    public static void main(String arg[])
    {
        fibonacci(0,1,20);
    }
    public static void fibonacci(int f,int s,int n)
    {
        if(n==1)
        {
            System.out.print(f);
        }
        else
        {
            System.out.print(f + " ");
            fibonacci(s, f+s, n-1);
        }
    }
}
