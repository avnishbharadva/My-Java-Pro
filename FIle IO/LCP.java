public class LCP {
    public static void main(String[] args) {
        String s[] = {"flocer","flovg","flo"};

        int c = 0;
        boolean x = true;
        for(int i=0;i<s[0].length();i++)
        {
            for(int j=0;j<s.length;j++)
            {
                if(s[0].charAt(i)!=s[j].charAt(i))
                {
                    x = false;
                    break;
                }
            }
            if(x)
            {
                c++;
            }
        }
        // System.out.println(s[0].charAt(0));
        System.out.println(c);
    }
}
