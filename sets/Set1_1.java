import java.util.Scanner;

public class Set1_1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String : ");
        String str = sc.nextLine();

        int len = str.length();
        String nstr = "";

        for(int i=len-1;i>=0;i--)
        {
            nstr += str.charAt(i);
        }

        if(str.equals(nstr))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}