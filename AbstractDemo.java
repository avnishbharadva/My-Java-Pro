abstract class Bike
{
    abstract void run();

    void simplemethod()
    {
        System.out.println("abstract class simple method");
    }
}
class Honda extends Bike
{
    void run()
    {
        System.out.println("Honda run");
    }
}
class Bajaj extends Bike
{
    void run()
    {
        System.out.println("Bajaj run");
    }
    void bd()
    {
        System.out.println("Bajaj display");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.simplemethod();
        Bajaj c = new Bajaj();
        c.bd();
        c.run();
        c.simplemethod();
    }
}
