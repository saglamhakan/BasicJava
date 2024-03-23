package kodlab.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrnekMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Ornek());

        executor.shutdown();

    }
}

/*
 for (int i = 0; i < 5; i++) { //3 threade 5 görev düşüyor
            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Görev #" + taskId + " " + Thread.currentThread().getName() + " tarafından çalıştırılıyor.");
                try {
                    Thread.sleep(10000); // Görevi temsilen bir bekleme
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // ExecutorService'i kapat
        executorService.shutdown();
 */