public class Varargs {

    void test(int ...a)
    {
        System.out.println(a.length);
    }
    void test(double...a)
    {
        System.out.println(a.length);
    }
    void test(boolean... a)
    {
        System.out.println(a.length + " " + a.getClass().getSimpleName());
    }
    void test(char ... a)
    {
        System.out.println(a.length);
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.test(true,false,true);
        obj.test(1,2);
        obj.test(6.7,8.8,8.6,3.4);
        obj.test('a','v','n','i','s','h');
        // obj.test();
    }
}
