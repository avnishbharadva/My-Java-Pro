class Outer
{
    private static int a = 10;

    void ot()
    {
        System.out.println("Outer data : " + a);
    }

    class Inner
    {
        void test()
        {
            System.out.println("Inner class method with data : " + a);
        }
    }
}
public class InnerclassEx {
    public static void main(String[] args) {

        Outer.Inner obj = new Outer().new Inner();

        obj.test();
    }
}
