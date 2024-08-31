public class CallByValueDemo {
    int num = 10;

    void change(int num)
    {
        this.num = num + 100;
    }
    public static void main(String args[])
    {
        CallByValueDemo obj = new CallByValueDemo();
        System.out.println("Num : " + obj.num);
        obj.change(238);
        System.out.println("NUm : " + obj.num);
    }
}
