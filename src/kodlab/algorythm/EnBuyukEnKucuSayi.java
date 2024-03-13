package kodlab.algorythm;

import java.util.Scanner;

public class EnBuyukEnKucuSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi;
        double enKucuk = Integer.MAX_VALUE;
        double enBuyuk = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". sayıyı giriniz");
            sayi = scanner.nextDouble();
            if (sayi>enBuyuk){
                enBuyuk = sayi;
            }
            if (sayi<enKucuk){
                enKucuk=sayi;
            }
        }
        System.out.println(enBuyuk);
        System.out.println(enKucuk);
    }
}
