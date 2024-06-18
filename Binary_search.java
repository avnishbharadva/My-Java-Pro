import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        for(int i=0;i<7;i++)
        {
            System.out.print("Enter value for " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter no you want to search : ");
        int ele = sc.nextInt();

        Binary_search obj = new Binary_search();
        obj.binary_search(arr,ele);
    }

    public void binary_search(int[] arr,int ele)
    {
        Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<7;i++)
        {
            System.out.println(i + " : " + arr[i]);
        }

        int lb=0,mid=0,ub=(arr.length-1),pos=-1;
        boolean found = false;

        while(lb<=ub && found==false)
        {
            mid = (lb+ub)/2;
            System.out.println("LB : " + lb + ",MID : " + mid + ",UB : " + ub + ",ELE : " + ele);
            if(arr[mid] == ele)
            {
                found = true;
                pos = mid;
                break;
            }
            else
            {
                if(arr[mid]>ele)
                    ub = mid - 1;
                else
                    lb = mid + 1;
            }
        }

        if(found){
            System.out.println(ele + " is found at position " + pos);
        }
        else{
            System.out.println(ele + " is not found in array");
        }
    }
}
