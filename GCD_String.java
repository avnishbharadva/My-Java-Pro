public class GCD_String {
    public static void main(String[] args) {
        String str1 = "bharadva";
        String str2 = "avnish";
        int c1=0,c2=0;
        // System.out.println(c1 + ", " + c2);
        String str = "";

        for(int i=0;i<(str1.length()+str2.length());i++)
        {
            if(c1!=(str1.length()))
            {
                str += str1.charAt(c1);
                c1++;
            }
            if(c2!=(str2.length()))
            {
                str += str2.charAt(c2);
                c2++;
            }
        }
        System.out.println(str);
    }
}
