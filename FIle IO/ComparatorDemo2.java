import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int no;
    String nm;

    Student(int no,String nm){
        this.no = no;
        this.nm = nm;
    }

    @Override
    public String toString() {
        return this.no + " : " + this.nm;
    }
}

class NoComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.no > s2.no)
            return 1;
        else if(s1.no < s2.no) 
            return -1;
        else 
            return 0;
    }
}
public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student(3,"anviw"));
        l.add(new Student(1,"adinw"));
        Collections.sort(l,new NoComparator());
        System.out.println(l);
    }
}
