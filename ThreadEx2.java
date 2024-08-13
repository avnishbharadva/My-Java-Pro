class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=7;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i=1;i<=7;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a.getPriority());
        a.setName("first thread");
        b.setName("second thread");
        a.start();
        b.start();
        System.out.println(b.getPriority());
    }
}
