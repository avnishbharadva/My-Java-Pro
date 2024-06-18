import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<7;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<7;i++)
        {
            for(int j=i;j<7;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
