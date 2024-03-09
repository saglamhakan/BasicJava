package algorythm2;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Fark: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpım: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 0) {
                    System.out.println("Bölüm: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi.");
                break;
        }
    }
}
