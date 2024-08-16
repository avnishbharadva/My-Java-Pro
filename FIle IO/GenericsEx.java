class MyGen<avnish>
{
    public avnish t1;
    
    MyGen(avnish t)
    {
        this.t1 = t;
    }

    public void setT(avnish t)
    {
        this.t1 = t;
    }
    public avnish getT()
    {
        return t1;
    }
}
public class GenericsEx {
    public static void main(String args[])
    {
        MyGen<Integer> obj = new MyGen<Integer>(7);
        System.out.println("Value : " + obj.getT());
        MyGen<String> o2 = new MyGen<String>("avnish");
        System.out.println("Value : " + o2.getT());
    }
}
