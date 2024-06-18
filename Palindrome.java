import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        no = sc.nextInt();

        Palindrome obj = new Palindrome();
        boolean ans = obj.check_palindrome(no);

        if(ans==true)
            System.out.println(no + " is Palindrome");
        else
            System.out.println(no + " is Not Palindrome");

        sc.close();
    }    

    // with the help of String
    // public boolean check_palindrome(int no)
    // {
    //     String str = Integer.toString(no);
    //     String nstr = "";

    //     for(int i=(str.length()-1);i>=0;i--)
    //     {
    //         nstr = nstr + str.charAt(i);
    //     }

    //     if(nstr.equals(str))
    //         return true;
    //     else
    //         return false;
    // }

    // without using String class
    public boolean check_palindrome(int no)
    {
        int temp = no;
        int ans = 0;

        while(temp!=0)
        {
            int last_digit = temp%10;
            ans = (ans*10) + last_digit;
            temp /= 10;
        }

        if(no==ans)
            return true;
        else
            return false;
    }
}
