package kodlab.thread;

public class Main {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.start();
        m2.start();

        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        m2.setPriority(Thread.MAX_PRIORITY); //Hangi threade daha fazla işlemcş zamanı ayarlayacağını belirler



    }
}
