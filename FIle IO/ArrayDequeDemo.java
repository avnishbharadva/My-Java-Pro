package CF;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String args[])
    {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // ad.add("avnish");
        ad.add(1);
        ad.addFirst(9283);
        ad.add(345);
        ad.addLast(72);
        // ArrayDeque<Integer> ad2 = new ArrayDeque<>(ad);
        // System.out.println(ad.equals(ad2));
        System.out.println(ad);
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
        ArrayDeque ad3 = ad.clone();
        System.out.println(ad3);
        // System.out.println(ad3.equals(ad));
        // System.out.println(ad2);
    }    
}
