import java.util.ArrayList;

public class MissingNum
{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,3,4,5,7};
        ArrayList<Integer> list = new ArrayList<>();
        int check = 1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=check)
            {
                // System.out.println(check);
                list.add(check);
                check++;
                // break;
            }
            check++;
        }

        System.out.println(list);
    }
}