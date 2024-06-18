import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        no = sc.nextInt();

        Armstrong obj = new Armstrong();
        boolean ans = obj.check_armstrong(no);

        if(ans==true)
            System.out.println(no + " is an Armstrong Number");
        else
            System.out.println(no + " is not an Armstrong number");

        sc.close();
    }    

    public boolean check_armstrong(int no)
    {
        int temp = no;
        int ans = 0;

        // first, we've to get the length of the 'no'
        // we can find the length using String length() for this first we have to convert 'no' to the String
        String str = Integer.toString(no);
        int len = str.length();
        
        // now, calculate power of each digit to length and then calculate their sum

        while(temp!=0)
        {
            int last_digit = temp % 10;
            int ldp = 1;
            for(int i=1;i<=len;i++)
            {
                ldp *= last_digit;
            }
            ans += ldp;
            temp /= 10;
        }

        // System.out.println("Ans : " + ans);

        if(no==ans)
            return true;
        else 
            return false;
    }
}
