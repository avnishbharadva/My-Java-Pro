public class WrapperEx {
    public static void main(String[] args) {
        // Integer i = new Integer(34);
        int z = 39;
        Integer i = Integer.valueOf(z); // boxing
        int x = i.intValue();  // unboxing
        System.out.println(i + " : " + x);

        Integer o = 43; // auto-boxing
        int v = o;  // auto-unboxing
        System.out.println(o + " : " + v);
    }
}
