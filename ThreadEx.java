class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("A : " + i);
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.err.println("B : " + i);
        }
    }
}

public class ThreadEx {
    public static void main(String args[]) {
        try {
            ThreadA oa = new ThreadA();
            ThreadB ob = new ThreadB();
            oa.start();
            ob.start();
            // oa.join(100000);
            // ob.join(0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
