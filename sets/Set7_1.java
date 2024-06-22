import java.util.Scanner;

public class Set7_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        int len = str.length();

        char c[] = new char[len];

        int k=0;
        for(int i=0;i<len;i++)
        {
            boolean found = false;
            int count = 1;
            for(int j=i+1;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    found = true;
                    count++;
                }
            }

            if(found==false)
            {
                c[k] = str.charAt(i);
                k++; 
            }
        }

        for(int i=0;i<k;i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
