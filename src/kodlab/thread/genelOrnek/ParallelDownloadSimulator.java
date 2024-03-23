package kodlab.thread.genelOrnek;

import kodlab.thread.genelOrnek.DownloadTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelDownloadSimulator {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        long baslangic = System.currentTimeMillis();
       executor.submit(new DownloadTask());

        executor.shutdown();
        long bitis = System.currentTimeMillis();

        System.out.println(bitis-baslangic);

    }
}
