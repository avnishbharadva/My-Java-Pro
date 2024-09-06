import java.util.HashMap;

public class PS_reject {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 7};
        int s = 5;
        int[] result = findTwoSum(a, s);

        if (result != null) {
            System.out.println("The two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers sum up to " + s);
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = target - num;
            System.out.println(complement + " : " + num);
            if (map.containsKey(complement)) {
                return new int[] {complement, num};
            }
            map.put(num, 1);
        }
        return null;
    }
}
