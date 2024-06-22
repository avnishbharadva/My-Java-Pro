import java.util.Scanner;

public class Set8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no : ");
        int no = sc.nextInt();

        String s = Integer.toString(no);
        int len = s.length();

        int temp = no;
        int ans = 0;

        while(temp!=0)
        {
            int ld = temp%10;
            int ldp = ld;
            for(int i=1;i<len;i++)
            {
                ldp *= ld;
            }
            ans += ldp;
            temp /= 10;
        }

        System.out.println("Ans : " + ans);
        if(no==ans)
            System.out.println(no + " is armstrong no");
        else 
            System.out.println(no + " is not armstrong no");
    }    
}
