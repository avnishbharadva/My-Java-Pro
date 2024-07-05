public class StaticEx {
    static int a = 20;
    int b = 100;

    static
    {
        System.out.println("static block called");
    }

    {
        System.out.println("Initializer block called");
    }

    static void tests()
    {
        a = 36470;
    }

    void test()
    {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    public static void main(String[] args) {
        System.out.println("a : " + StaticEx.a);
        StaticEx.tests();
        StaticEx.a = 7878;
        StaticEx o1 = new StaticEx();
        o1.test();
        
        StaticEx o2 = new StaticEx();
        o2.test();
    }
}
