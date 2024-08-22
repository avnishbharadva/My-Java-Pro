import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test
{
    int rollno;
    String name;
    
    Test(int rollno,String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[ Roll NO : " + rollno + " Name : " + name + " ]";
    }
}
class RollNoComparator implements Comparator<Test>
{
    @Override
    public int compare(Test o1,Test o2)
    {
        return o1.rollno - o2.rollno;
    }
}
class NameComparator implements Comparator<Test>
{
    @Override
    public int compare(Test o1,Test o2)
    {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        list.add(new Test(3,"radhe"));
        list.add(new Test(2,"Krishan"));
        list.add(new Test(1,"Kalgi"));
        list.add(new Test(4,"Avnish"));

        System.out.println(list);

        // Collections.sort(list, new RollNoComparator());
        // Collections.sort(list, new NameComparator());

        Collections.sort(list, new Comparator<Test>(){
            @Override
            public int compare(Test o1,Test o2)
            {
                return o1.rollno - o2.rollno;
            }
        });
        System.out.println(list);
    }
}
