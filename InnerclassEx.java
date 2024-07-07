class Outer
{
    private static int a = 10;

    void ot()
    {
        System.out.println("Outer data : " + a);
    }

    static class Inner
    {
        int b = 100;
        void test()
        {
            System.out.println("Inner class method with data : " + a + " , " + b);
        }
    }
}
public class InnerclassEx {
    public static void main(String[] args) {

        // Outer o = new Outer();
        Outer.Inner obj = new Outer.Inner();
        obj.test();
    }
}
