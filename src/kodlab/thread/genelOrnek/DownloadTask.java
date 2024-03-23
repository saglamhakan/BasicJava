package kodlab.thread.genelOrnek;

import java.util.concurrent.atomic.AtomicLong;

public class DownloadTask extends Thread{

    String[] url = {"http://example.com/data1",
            "http://example.com/data2",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3",
            "http://example.com/data3"};

    public void run(){
        for (String item:url) {
            System.out.println(Thread.currentThread().getName() + item);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }
}
