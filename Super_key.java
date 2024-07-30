class A 
{
    int a,b,c;

    A(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void dispa()
    {
        System.out.println("A : " + a + " B : " + b + " C : " + c);
    }
}

class B extends A 
{
    int d;
    B(int a,int b,int c,int d)
    {
        super(a, b, c);
        this.d = d;
    }

    void dispb()
    {
        super.dispa();
        System.out.println("A : " + a + " B : " + b + " C : " + c + " D : " + d);
    }
}
class Super_key {
    public static void main(String[] args) {
        B obj = new B(1, 2, 3, 4);
        obj.dispa();
        obj.dispb();
    }
}
