class A{
    String str = "a";
    {
        System.out.println("1");
    }
}
class B extends A{
    B(){
        str = str.concat("b");
    }
    {
        System.out.println("2");
    }
}
class C extends B{
    C(){
        str = str.concat("jwnv");
    }
    {
        System.out.println("3");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        C o = new C();
        System.out.println(o.str);
        System.out.println(o.getClass());
        String a = "10";
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
    }
}
