package kodlab.thread;

public class Main3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new WorkerThreadWithAlive(), "Thread-1");
        Thread thread2 = new Thread(new WorkerThreadWithAlive(), "Thread-2");
        Thread thread3 = new Thread(new WorkerThreadWithAlive(), "Thread-3");

        // Thread'leri başlat
        thread1.start();
        thread2.start();
        thread3.start();

        // Thread'lerin durumunu kontrol et ve konsola yazdır
        printThreadStatus(thread1);
        printThreadStatus(thread2);
        printThreadStatus(thread3);
    }

    private static void printThreadStatus(Thread thread) {
        if (thread.isAlive()) {
            System.out.println(thread.getName() + " hala çalışıyor.");
        } else {
            System.out.println(thread.getName() + " çalışmıyor.");
        }
    }
    }

