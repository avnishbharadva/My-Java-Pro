import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int []arr = {11,4,6,34,2};

        System.out.println(arr);

        Arrays.sort(arr);

        for(int a:arr)
        {
            System.out.print(a + ", ");
        }

        List<int[]> lst =  Arrays.asList(arr);
        System.out.println(lst);
        for(int a[]:lst)
        {
            System.out.println(a);
        }
    }
}
