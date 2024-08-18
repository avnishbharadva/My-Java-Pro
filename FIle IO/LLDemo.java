package CF;

import java.util.LinkedList;
import java.util.List;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(100);
        l.add(345);
        for(int a:l)
        {
            System.out.println(a);
        }
        System.out.println(l.element());
        System.out.println(l.poll());
        l.push(23);
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println("Element at 0 : " + l.get(0));
        System.out.println("Position of 100 : " + l.indexOf(100));
        System.out.println(l.element());
    }    
}
