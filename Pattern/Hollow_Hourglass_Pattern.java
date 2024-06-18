public class Hollow_Hourglass_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=4;j>=i;j--)
            {
                if(i==1 || j==4 || j==i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=4;j++)
            {
                if(j==i || j==4 || i==1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
