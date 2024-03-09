package algorythm2;

import java.util.Scanner;

public class ÇiftVe4ünKatıOlanSayılarınToplamınıBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();

            // Tek sayı girildiğinde döngüden çık
            if (sayi % 2 != 0) {
                break;
            }
            // Çift ve 4'ün katı olan sayıları topla
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
    }

