public class ThreadEx extends Thread
{
    String task;

    ThreadEx(String task)
    {
        this.task = task;
    }
    public void run()
    {
        for(int i=1;i<=12;i++)
        {
            System.out.println(this.task + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[])
    {
        ThreadEx oa = new ThreadEx("Kalgu");
        oa.start();
        ThreadEx ob = new ThreadEx("Radha krishan");
        ob.start();
    }
}