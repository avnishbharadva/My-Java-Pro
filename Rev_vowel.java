public class Rev_vowel {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        StringBuilder ns = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                ns.append(str.charAt(i));
                // str.replace(i, i+1, "1");
            }
        }
        // System.out.println(ns);
        // System.out.println(str);
        
        ns.reverse();
        // System.out.println(ns);
        int z=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                str.replace(i, i+1, (String.valueOf(ns.charAt(z))));
                z++;
            }
        }
        System.out.println(str);
    }
}
