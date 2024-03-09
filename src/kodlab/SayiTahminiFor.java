package kodlab;

import java.util.Scanner;

public class SayiTahminiFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rastgeleSayi = (int) (Math.random()*10 + 1);
        System.out.println("1 ile 10 arasında bir sayı giriniz");

        for (int tahminSayisi = 1; tahminSayisi <=10 ; tahminSayisi++) {
            System.out.println(tahminSayisi + ". Tahmininizi giriniz");
            int tahmin = scanner.nextInt();

            if (!(tahmin>0 && tahmin<100)){
                System.out.println("Girdiğiniz sayı 1 ile 100 arasında olmalı");
                tahminSayisi--;
                continue;
            }
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler, " + tahminSayisi + ". denemenizde doğru tahmin ettiniz!");
                break;
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Girdiğiniz sayı daha küçük. Tekrar deneyin:");
            } else {
                System.out.println("Girdiğiniz sayı daha büyük. Tekrar deneyin:");
            }

            if (tahminSayisi == 10) {
                System.out.println("Üzgünüm, tahmin hakkınız bitti. Sayı: " + rastgeleSayi + " idi.");
            }
        }
    }
}
