public class Recursion {
    int fact(int n)
    {
        if(n==1)
            return 1;
        int res = fact(n-1) * n;
        return res;
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println("Fact of 5 : " + r.fact(5));
        System.out.println("4 : " + r.fact(4));
        System.out.println("6 : " + r.fact(6));
    }
}
