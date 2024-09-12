public class EvenStr {
    public static void main(String[] args) {
        String str = "odd words even words four two";
        String nstr = "";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                nstr += str.charAt(i);
            }
            else
            {
                if(nstr.length()%2==0)
                    System.out.println(nstr);
                nstr = "";
            }
        }
        nstr = "";

        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                nstr += str.charAt(i);
            }
            else
            {
                if(nstr.length()%2==0)
                {
                    System.out.println(new StringBuffer(nstr).reverse());
                    break;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
