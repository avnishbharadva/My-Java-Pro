class Parent{
    void disp()
    {
        System.out.println("PArent class");
    }
}
class Child extends Parent{
    void disp()
    {
        super.disp();
        System.out.println("Child class method overriding");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.disp();
    }
}
