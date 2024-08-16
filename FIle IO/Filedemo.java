import java.io.*;

public class Filedemo {
    public static void main(String[] args) {
        try {
            File f = new File("demo.txt");
            System.out.println("Is file : " + f.isFile());
            System.out.println("Is exits : " + f.exists());
            System.out.println("Absolute Path : " + f.getAbsolutePath());
            System.out.println("Path : " + f.getPath());
            System.out.println("Name : " + f.getName());
            f.delete();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }    
}
