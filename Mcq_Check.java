final class A{
    int i;
}    

class B extends A 
{
    int j =10;
    
    B()
    {
        System.out.println(j + " " + i);
    }
}

public class Mcq_Check {
    public static void main(String[] args) {
        // char chars[] = {'1','d','f'};
        // String str = new String(chars);
        // System.out.println(str);
        // System.out.println(chars);

        // byte b = (byte)264;
        // System.out.println(b);

        B obj = new B();
        
    }
}
