package kodlab.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SayılarinToplami100Thread implements Runnable{

  int total = 0;
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
           total+=i;
            if (total<=100){
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+" " + total);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new SayılarinToplami100Thread());
        executor.shutdown();
    }
}
