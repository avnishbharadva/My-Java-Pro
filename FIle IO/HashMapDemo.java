import java.util.*;

public class HashMapDemo {
    public static void main(String args[])
    {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // for(int i=1000;i>0;i--)
        // {
        //     hashMap.put(i, Integer.toString(i));
        // }

        // for(Map.Entry me : hashMap.entrySet())
        // {
        //     System.out.println(me.getKey() + " : " + me.getValue());
        // }

        hashMap.put(3,"avnish");
        hashMap.put(2, "radhe");
        hashMap.put(1, "krishan");

        // for(HashMap.Entry entry : hashMap.entrySet())
        // {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        // Set set = hashMap.entrySet();

        // // System.out.println(set);

        // Iterator iterator = set.iterator();
        // while(iterator.hasNext())
        // {
        //     Map.Entry entry = (Map.Entry) iterator.next();
        //     System.out.println(entry.getKey() + " => " + entry.getValue());
        //     // System.out.println(iterator.next());
        // }
        Collection<String> c = hashMap.values();
        System.out.println(c);
        System.out.println(hashMap);
    }    
}
