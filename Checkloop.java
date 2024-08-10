public class Checkloop {

    static{
        System.out.println("from inside static block");
    }
    {
        System.out.println("from inside class");
    }

    //for(int j=0;j<4;j++)
    {
        System.out.println("loop inside em nem");
    }
    public static void main(String[] args) {
        for(int i=0;i<4;i++);
        {
            Checkloop obj = new Checkloop();
            System.out.println("avnish");
            Checkloop o2 = new Checkloop();
        }
        Checkloop o3 = new Checkloop();
    }
}
