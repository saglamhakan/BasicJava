package kodlab.thread;

public class MyThread extends Thread{

    public void run() {
        try {
            Thread.sleep(10000); // Thread'i 1 saniye uyutur.
            System.out.println("Thread çalışıyor " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
