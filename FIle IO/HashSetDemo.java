package CF;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[])
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(13);
        hs.add(1);
        hs.add(2);
        hs.add(344);
        hs.add(23);
        hs.add(11);
        hs.add(565);
        // hs.add("avnish");
        System.out.println(hs);
        for(int a:hs)
        {
            System.out.println(a);
        }
    }
}
