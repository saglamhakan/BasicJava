package kodlab.thread;

import java.util.concurrent.Executor;

public class Main1 {
    public static void main(String[] args) {
        // Üç thread oluştur ve her birine özel bir isim ata
        Thread thread1 = new Thread(new WorkerThread(), "Thread-1");
        Thread thread2 = new Thread(new WorkerThread(), "Thread-2");
        Thread thread3 = new Thread(new WorkerThread(), "Thread-3");

        // Thread'leri başlat
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
