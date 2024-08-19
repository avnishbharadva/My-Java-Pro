class Phone
{
    void showTime()
    {
        System.out.println("8 PM");
    }
    void on()
    {
        System.out.println("Phone on");
    }
}
class SmartPhone extends Phone
{
    void on()
    {
        System.out.println("Smart Phone on");
    }
    void music()
    {
        System.out.println("Playing music");
    }
}
public class Demo2
{
    public static void main(String[] args) {
        Phone p = new Phone();
        p.on();
        p.showTime();
        // p.music();
        SmartPhone sp = new SmartPhone();
        sp.on();
        sp.showTime();
        sp.music();
        Phone p2 = new SmartPhone();
        p2.on();
        p2.showTime();
        // p2.music(); 
    }
}