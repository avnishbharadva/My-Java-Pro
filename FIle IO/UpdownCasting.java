class A 
{
    void display1()
    {
        System.out.println("Display 1");
    }
}
class B extends A 
{
    void display2()
    {
        System.out.println("Display 2");
    }
}
public class UpdownCasting {
    public static void main(String args[])
    {
        // int a = 87;
        // float b = a; // widening type casting / implicit
        // double c = a;
        // char d = (char)a; // narrowing type casting / explicit 
        // System.out.println("A : " + a);
        // System.out.println("B : " + b);
        // System.out.println("C : " + c);
        // System.out.println("D : " + d);

        // int x = (int)c;
        // System.out.println("X : " + x);

        A obja = new A();
        obja.display1();
        B objB = new B();
        objB.display1();
        objB.display2();
        A obja2 = (A)new B();  // up casting
        obja2.display1();
        // obja2.display2(); // error
        B objB2 = (B) obja2;  // down casting
        objB2.display1();
        objB2.display2(); 
    }    
}
