package StringDemo;

public class StringDemo {
    public static void main(String args[])
    {
        // StringBuffer sb = new StringBuffer("Avnish");
        // System.out.println("Capacity : " + sb.capacity());

        // System.out.println(sb.hashCode());
        // sb.append(" Bharadva");
        // System.out.println("Capacity : " + sb.capacity());

        // System.out.println(sb);
        // System.out.println(sb.hashCode());

        // sb.replace(1,1,"java is great language wfjo plpwfp jicnwi");
        // System.out.println("New : " + sb);
        // System.out.println("Capacity : " + sb.capacity());

        String str = "Radhe radhe";
        System.out.println("Destination : " + str);
        System.out.println(str.hashCode());
        str = "Radhe Krishan";
        System.out.println("New Destination : " + str);
        System.out.println(str.hashCode());
        double d = 5.6;
        float f = (float)45.767676;
        float f2 = 1.2f;
        System.out.printf("%.3f %.1f",f,f2);

        System.out.printf("\n%.2f",d);

        // StringBuilder sbld = new StringBuilder("good bye");
        // // "string builder";
        // System.out.println("SB : " + sbld);
        // System.out.println(sbld.hashCode());
        // sbld.append("cruel world");
        // System.out.println("New sb : " + sbld);
        // System.out.println(sbld.hashCode());
    }
}
