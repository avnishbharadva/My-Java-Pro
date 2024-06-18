import java.util.Scanner;

public class Bubble_sort {
    public static void main(String args[])
    {
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<7;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            arr[i] = sc.nextInt();
        }

        Bubble_sort obj = new Bubble_sort();
        obj.bubbleSort(arr);
    }    

    public void bubbleSort(int arr[])
    {
        for(int i=6;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array : \n");
        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
