public class Finalizemethod {
    // public void finalize()
    // {
    //     System.out.println("finalize method called");
    // }
    // public static void main(String[] args) {
    //     Finalizemethod o1 = new Finalizemethod();
    //     Finalizemethod o2 = new Finalizemethod();
    //     o1 = null;
    //     o2 = null;
    //     System.gc();
    // }
    public static void main(String[] args) {
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
        }
    }
}
