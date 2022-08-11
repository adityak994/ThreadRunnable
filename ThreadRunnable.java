class Thread1 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }

}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }
}

class Thread3 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }
}

class Thread4 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }
}

class Thread5 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }
}

public class ThreadRunnable {
    public static void main(String argvs[]) {
        Thread1 m1 = new Thread1();
        Thread t1 = new Thread(m1);
        Thread2 m2 = new Thread2();
        Thread t2 = new Thread(m2);
        Thread3 m3 = new Thread3();
        Thread t3 = new Thread(m3);
        Thread4 m4 = new Thread4();
        Thread t4 = new Thread(m4);
        Thread5 m5 = new Thread5();
        Thread t5 = new Thread(m5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}