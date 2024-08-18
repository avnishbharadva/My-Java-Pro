abstract class Parent
{
    abstract void display();
}

class Child extends Parent
{
    public void display()
    {
        System.out.println("child display");
    }
    public void childd()
    {
        System.out.println("child own method");
    }
}

public class Demo
{
    public static void main(String args[])
    {
        Parent p = new Child();
        p.display();
        Child c = new Child();
        c.childd();
        c.display();
    }
}