package algorythm2;

import java.util.Scanner;

public class KüçüktenBüyüğeSayıSıralama {
    public static void main(String[] args) {
        int n;

        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scanner.nextInt();

        for (int i =1; i<=n; i++){
            System.out.println(i + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi>enBuyuk){
                enBuyuk = sayi;
            }
            if (sayi<enKucuk){
                enKucuk = sayi;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
