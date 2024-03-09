package kodlab.odev;

import java.util.Scanner;

public class SiparisSistemi {
    public static void main(String[] args) {

        int kahve = 3;
        int cay = 2;
        int siparis;
        int total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Siparişinizi giriniz: 1-Çay - 2-Kahve");
        int select = scanner.nextInt();
        System.out.println("Kaç tane içeceksiniz: ");
        siparis = scanner.nextInt();


            if (select == 1) {
                if (siparis >= 10) {
                    total = (siparis * cay) * 9 / 10;
                    System.out.println("Toplam fiyat: " + total + " tl");

                } else {
                    total = siparis * cay;
                    System.out.println("Toplam fiyat: " + total + " tl");
                }

            } else if (select == 2) {
                if (siparis >= 10) {
                    total = (siparis * kahve) * 9 / 10;
                    System.out.println("Toplam fiyat: " + total + " tl");

                } else {
                    total = siparis * kahve;
                    System.out.println("Toplam fiyat: " + total + " tl");
                }
            } else {
                System.out.println("Bu içeçecek kalmadı");
            }
        }
    }

