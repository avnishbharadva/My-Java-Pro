@FunctionalInterface
interface demo1
{
    void meth1(int a);
    // void meth2();
}

public class LambdaExDemo {
    public static void main(String args[])
    {
        // anonymous class
        demo1 ref2 = new demo1(){
            public void meth1(int a)
            {
                System.out.println("Avnish : " + a);
            }
            public void meth2()
            {
                System.out.println("Radhe radhe");
            }
        };

        //using lambda expression
        demo1 ref1 = a->System.out.println("kndkwmkmwkf " + a);  // one liner

        // demo1 ref1 = (a)->{
        //     System.out.println("radhe radhe " + a);
        // };
        ref1.meth1(7);

        // ref2.meth1(11);
        // ref2.meth2();
    }
}
