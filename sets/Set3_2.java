import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Set3_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();

        String a[] = str.split(" ");

        int max=-1,pos=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].length()>max)
            {
                // System.out.println(max);
                max = a[i].length();
                pos = i;
            }
        }

        System.out.println("Largest word is : " + a[pos]);
    }
}
