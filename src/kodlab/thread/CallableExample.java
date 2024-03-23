package kodlab.thread;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executor = Executors.newFixedThreadPool(2);

            Callable<Integer> task = () -> {
                Thread.sleep(5000); // Görevin biraz zaman aldığını simüle ediyoruz.
                return 123; // Görev sonucu olarak bir sayı döndürüyoruz.
            };

            Future<Integer> future = executor.submit(task);

            // Diğer işlemleri yaparken, görevin sonucunun hazır olmasını bekleyebiliriz.
            System.out.println("Görev sonucu bekleniyor...");

            Integer result = future.get(); // Görevin sonucunu bloke edici bir şekilde alıyoruz.

            System.out.println("Görev sonucu: " + result);

            executor.shutdown();
        }
    }

