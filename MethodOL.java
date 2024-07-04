public class MethodOL {
    int a,b;

    MethodOL(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    boolean eqauls(MethodOL obj)
    {
        if(this.a==obj.a && this.b==obj.b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        MethodOL obj1 = new MethodOL(10, 20);
        MethodOL obj2 = new MethodOL(10, 20);

        System.out.println("Is equals : " + obj1.eqauls(obj2));
    }
}
