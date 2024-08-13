class Printtable
{
    // public synchronized void table(int n)
    public void table(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i + " * " + n + " = " + (i*n));
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class MyThread1 extends Thread
{
    Printtable t;
    MyThread1(Printtable t)
    {
        this.t = t;
    }
    public void run()
    {
        // Printtable o = new Printtable();
        t.table(3);
    }
}
class MyThread2 extends Thread
{
    Printtable t;
    MyThread2(Printtable t)
    {
        this.t = t;
    }
    public void run()
    {
        // Printtable o = new Printtable();
        t.table(5);
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Printtable t = new Printtable();
        // Printtable o = new Printtable();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}
