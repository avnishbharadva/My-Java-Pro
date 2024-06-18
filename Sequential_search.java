import java.util.Scanner;

public class Sequential_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        for(int i=0;i<7;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<7;i++)
        {
            System.out.println(i + " : " + arr[i]);
        }

        System.out.println("Enter no you want to search : ");
        int ele = sc.nextInt();

        boolean found = false;
        int pos = -1;

        for(int i=0;i<7;i++)
        {
            if(arr[i]==ele)
            {
                found = true;
                pos = i;
                break;
            }
        }
         
        if(found){
            System.out.println(ele + " is found at position " + pos);
        }else{
            System.out.println(ele + " is not found in the array");
        }
    }
}
