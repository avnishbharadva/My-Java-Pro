import java.util.Scanner; 

public class Set13_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String nstr = "";
        for(int i=str.length()-1;i>=0;i--)
            nstr += str.charAt(i);

        System.out.println("Reverse String : " + nstr);
    }    
}
