package kodlab.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread çalışıyor : " + Thread.currentThread().getName());

    }
}
