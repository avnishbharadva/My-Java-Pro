import java.util.Scanner;

public class Spy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int pro = 1;

        while(temp!=0)
        {
            int ld = temp % 10;
            sum += ld;
            pro *= ld;
            temp /= 10;
        }

        if(sum==pro)
            System.out.println(n + " is spy num");
        else
            System.out.println(n + " is not spy number");
    }
}
