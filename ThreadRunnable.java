class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        try {
            MyThread mt = new MyThread();
            Thread t = new Thread(mt);
            t.start();
            t.join();
            System.out.println("Thread is under execution");
            for (int i = 1; i <= 100; i++) {
                System.out.println("Loop : " + i);
            }
        } catch (Exception e) {
            // TODO: handle
            System.out.println(e.getMessage());
        }
    }
}
