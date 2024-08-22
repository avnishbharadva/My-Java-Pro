class Test
{
    private static final Test instance = new Test();
    private void Test()
    {

    }
    public static Test getInstance()
    {
        return instance;
    }
}
public class SingleTonDemo {
    public static void main(String[] args) {
        Test obj1 = Test.getInstance();
        Test obj2 = Test.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
