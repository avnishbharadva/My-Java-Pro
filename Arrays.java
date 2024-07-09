public class Arrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][];

        arr[0] = new int[10];
        arr[1] = new int[12];
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.toString());
        System.out.println(arr);
        System.out.println(new int[] {45,'a'});

        String s[] = new String[3];

        s[1] = "radha";
        s[2] = "krishan";

        for(String str : s)
            System.out.println(str);
    }
}
