class Test
{
    int a;

    Test(int a)
    {
        this.a = a;
    }

    Test IncrementByTen()
    {
        Test temp = new Test(a + 10);
        return temp;
    }
}
public class ReturnO {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = t1.IncrementByTen();

        System.out.println("T1 : " + t1.a);
        System.out.println("T2 : " + t2.a);

        System.out.println(t2);

        t2 = t2.IncrementByTen();
        System.out.println("T2 : " + t2.a);

        System.out.println(t2);
    }
}
