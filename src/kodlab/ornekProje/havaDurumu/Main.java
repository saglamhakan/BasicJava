package kodlab.ornekProje.havaDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava durumu bilgilerini görmek istediğiniz şehri giriniz:");
        String sehir = scanner.nextLine();

        // HavaDurumu nesnesi oluşturulur ve rastgele hava durumu bilgileri üretilir.
        HavaDurumu havaDurumu = new HavaDurumu();

        System.out.println(sehir + " şehri için hava durumu bilgileri:");
        havaDurumu.bilgileriYazdir();
    }
    }

