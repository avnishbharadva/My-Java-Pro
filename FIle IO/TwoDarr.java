public class TwoDarr {
    public int a;

    // @Override
    // public boolean equals(TwoDarr o2){
    //     if(this.a == o2.a)
    //         return true;
    //     else 
    //         return false;
    // }
    public String toString(){
        return "2-d array";
    }
    public static void main(String[] args) {
        TwoDarr o1 = new TwoDarr();
        o1.a = 10;
        TwoDarr o3 = o1;
        TwoDarr o2 = new TwoDarr();
        o2.a = 10;
        System.out.println(o1.getClass());
        System.out.println(o1.equals(o2));
        System.out.println(o1);
        System.out.println(o1.hashCode());
        System.out.println("o1 and o3 : " + o1.equals(o3));
        int arr[][] = new int[3][2];
        int x = 1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j] = x++;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr);
    }
}
