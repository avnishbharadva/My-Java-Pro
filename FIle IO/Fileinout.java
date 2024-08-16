import java.io.*;

public class Fileinout {
    public static void main(String args[])
    {
        try{
            // BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt", true));
            // bw.write("\n1139");
            // bw.close();

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("demo.txt",true));
            String s = "good bye cruel world";
            byte[] arr = s.getBytes();
            bos.write(arr);
            bos.close();

            BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
            int c;
            // while((c=br.read())!=-1)
            // {
            //     // System.out.print((char)br.read());
            //     System.out.print((char)c);
            // }
            while(br.ready())
            {
                System.out.println(br.readLine());
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}
