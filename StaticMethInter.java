interface Drawable
{
    void draw();  // public abstract 
    public static int cube(int x)
    {
        return x*x*x;
    }
    default void msg()
    {
        System.out.println("Called default method msg");
        pmet();
    }
    private void pmet()
    {
        System.out.println("Called private method in interface");
    }
}
class Test implements Drawable
{
    public void draw()
    {
        System.out.println(Drawable.cube(4));
        System.out.println("Draw method");
        msg();
    }
}
public class StaticMethInter {
    public static void main(String[] args) {
        System.out.println(Drawable.cube(3));
        Test obj = new Test();
        obj.draw();
        obj.msg();
    }
}
