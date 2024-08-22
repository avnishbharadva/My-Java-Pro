import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test implements Comparable<Test>
{
    int id;
    String name;

    Test(int id,String name)
    {   
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Test obj)
    {
        return this.id - obj.id;
    }
    
    @Override
    public String toString()
    {
        return "Id : " + id + " Name : " + name;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        list.add(new Test(3, "radhe"));
        list.add(new Test(2, "krishan"));
        list.add(new Test(1,"kalgi"));
        list.add(new Test(4,"avnish"));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
