import java.util.Scanner;

public class Set9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string : ");
        String str = sc.nextLine();

        System.out.print("Enter character to count : ");
        char c = sc.next().charAt(0);

        boolean found = false;
        int count = 0;

        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                found = true;
                count++;
            }
        }

        if(found)
        {
            System.out.println(c + " is occurence " + count + " times");
        }
        else
        {
            System.out.println(c + " is not in the String");
        }
    }
}
