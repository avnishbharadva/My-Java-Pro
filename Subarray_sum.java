import java.util.Scanner;

public class Subarray_sum {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sum : ");
        int sum = sc.nextInt();

        boolean found = false;

        for(int i=0;i<arr.length;i++)
        {
            int ns = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                ns += arr[j];

                if(ns==sum)
                {
                    System.out.println(i + " : " + j);
                    found = true;
                    break;
                }
            }
        }

        if(found==false)
            System.out.println("subarray of sum not found");
    }
}
