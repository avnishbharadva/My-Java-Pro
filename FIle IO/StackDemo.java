package CF;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
    }
}
