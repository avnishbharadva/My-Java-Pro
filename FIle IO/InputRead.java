import java.io.*;

public class InputRead {
    public static void main(String args[])
    {
        try {
            int b = 'S';
            System.out.write(b);

            System.out.write('\n');
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // InputStreamReader br = new InputStreamReader(System.in);
            System.out.print("Enter name : ");
            int c = br.read();

            // System.out.println();
            // System.out.println("First : " + (char)c);
            // int c = br.read(); 
            
            int z = 'Z';
            System.out.write(z);

            while(br.ready())
            {
                System.out.write(c);
                System.out.println();
                // System.out.println((char)c);
                c = br.read();
            }

            System.out.print("Enter name 2 : ");
            String str = br.readLine();
            System.out.println(str);
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
