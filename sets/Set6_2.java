import java.util.Scanner;

public class Set6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i=size-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
