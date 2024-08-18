package CF;

import java.util.*;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(23);
        s.add(11);
        s.add(18);
        System.out.println(s.ceiling(22));
        System.out.println(s);
    }
}
