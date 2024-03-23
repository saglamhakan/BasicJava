package kodlab.thread;

public class Ornek extends Thread{

    public void run(){
        try {
           double randomNum = Math.random()*100 + 1;
           if (!(randomNum ==100)){
               Thread.sleep(2000);
               System.out.println(Thread.currentThread().getName() + " generated value: " + randomNum);
           }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
