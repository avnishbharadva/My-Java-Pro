import java.util.Scanner;

public class Set12_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int s = sc.nextInt();

        int a[] = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter value for " + i + " : ");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i:a)
            if(i>max)
                max = i;

        System.out.println("Largest Value : " + max);
    }
}
