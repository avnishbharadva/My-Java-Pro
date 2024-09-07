import java.util.*;

class Student implements Comparable<Student>
{
    int no;
    String nm;

    Student(int n,String nm){
        this.no = n;
        this.nm = nm;
    }

    public int compareTo(Student s){
        if(this.no > s.no)
            return 1;
        else if(this.no < s.no)
            return -1;
        else 
            return 0;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.no + " : " + this.nm;
    }
}
public class CompableDemo {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student(2,"avnisj"));
        l.add(new Student(1, "kmfw"));
        Collections.sort(l);
        System.out.println(l);
    }
}
