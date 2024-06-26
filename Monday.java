public class Monday {
    public static void main(String[] args) {
        System.out.println("monday");
        System.out.println(args[0]);
        String str[] = {"anvish","anda"};
        Tuesday.main(str);
        Monday.main("avnish");
    }   

    public static void main(String args) {
        System.out.println(args);
    }
}

class Tuesday{
    public static void main(String[] args) {
        System.out.println("tuesday");
    }
}