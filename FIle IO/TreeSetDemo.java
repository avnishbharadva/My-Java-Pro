package CF;

import java.util.*;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(23);
        s.add(11);
        s.add(18);
        s.add(99);
        s.add(132);
        System.out.println("Ceiling of 22 : " + s.ceiling(22));
        System.out.println("First : " + s.first());
        System.out.println("Class : " + s.getClass());
        System.out.println("Last : " + s.last());
        // System.out.println("Poll First : " + s.pollFirst());
        // System.out.println("Poll Last : " + s.pollLast());
        System.out.println("HeadSet 21 : " + s.headSet(21));
        System.out.println("TailSet 19 : " + s.tailSet(19));
        System.out.println("Subset : " + s.subSet(11,99));
        System.out.println(s);
    }
}
