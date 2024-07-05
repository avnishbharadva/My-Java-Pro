import java.util.Scanner;

public class Neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any number : ");
        int no = sc.nextInt();

        int sq = no * no;

        int sum = 0;
        int temp = no;
        while(temp!=0)
        {
            int ld = temp%10;
            sum += ld;
            temp /= 10;
        }

        if(no==sum)
            System.out.println(no + " is neon number");
        else
            System.out.println(no + " is not neon number");
    }
}
