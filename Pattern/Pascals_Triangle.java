public class Pascals_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<=4;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1 || j==1 || j==i)
                    System.out.print("1 ");
                else 
                    System.out.print((i-1) + " ");
            }
            System.out.println();
        }
    }
}
