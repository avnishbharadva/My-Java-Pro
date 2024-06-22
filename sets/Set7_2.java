import java.util.Scanner;

public class Set7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int s = sc.nextInt();

        int a[] = new int[s];

        for(int i=0;i<s;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            a[i] = sc.nextInt();
        }

        int even=0,odd=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]%2==0)
            {
                even += a[i];
            }
            else
            {
                odd += a[i];
            }
        }

        System.out.println("Even Sum : " + even);
        System.out.println("Odd Sum : " + odd);
        System.out.println("Difference : " + (even-odd));
    }
}
