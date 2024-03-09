package kodlab.algorythm;

import java.util.Random;

public class ZarAtma {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            int sayi1 = r.nextInt(6);
            sayi1+=1;

            int sayi2 = r.nextInt(6);
            sayi2+=1;

            System.out.println("Zardan gelen sayılar ");
            System.out.println(sayi1 + "-" +sayi2);

        }
    }
}
