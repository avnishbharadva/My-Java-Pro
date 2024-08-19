import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    String name;
    transient int age;

    Student(String nm,int a)
    {
        this.name = nm;
        this.age = a;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        Student s = new Student("Avnish",22);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("serial.txt"));

            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(s);
            oos.close();
            bos.close();
            System.out.println("Object Write");

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("serial.txt"));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student ds = (Student) ois.readObject();
            ds.display();
            ois.close();
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
