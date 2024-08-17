package CF;

import java.util.*;

public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        // al.add("avnish");
        al.add(2);
        al.add(3);
        al.add(11);
        // for(int i=0;i<al.size();i++)
        // {
        //     System.err.println(al.get(i));
        // }
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);

        // al.retainAll(al2);
        // System.out.println();
        // for(int a:al)
        // {
        //     System.out.println(a);
        // }
        // System.out.println(al.toArray());
        Object[] a = al.toArray();
        // for(Object ar:a)
        // {
        //     System.out.println(ar);
        // }
        // System.out.println(al.contains(23));

        List<String> l = new ArrayList<>(1);
        // l.add(1);

        System.out.println("Size : " + l.size());
        
        l.add("avnish");
        l.add("radhe radhe");
        l.add("kalgi");
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        l.set(0,"krishan");
        System.out.println(l.toString());
        System.out.println("Size : " + l.size());
        System.out.println(l);
    }
}
