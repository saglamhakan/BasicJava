package kodlab.thread;

public class WorkerThread extends Thread{

    @Override
    public void run() {
        try {
            // Thread'in çalıştığını göster
            System.out.println(Thread.currentThread().getName() + " çalışıyor...");

            // Thread'i 5 saniye uyut
            Thread.sleep(5000);

            // Thread'in uyandığını ve işlemini tamamladığını göster
            System.out.println(Thread.currentThread().getName() + " uyandı ve işlemi tamamladı.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
