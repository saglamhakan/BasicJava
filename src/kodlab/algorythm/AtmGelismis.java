package kodlab.algorythm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AtmGelismis {
    public static void main(String[] args) {
        ArrayList<String> islemGecmisi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        double toplamBakiye = 1000;
        int password;
        boolean accessGranted = false;

        for (int i = 3; i >= 1 && !accessGranted; i--) {
            System.out.println("Şifre giriniz: ");
            password = scanner.nextInt();
            if (password == 1234) {
                System.out.println("Başarılı giriş");
                accessGranted = true;
            } else {
                System.out.println("Hatalı giriş, kalan hakkınız: " + (i - 1));
                if (i == 1) {
                    System.out.println("Hesap bloke olmuştur.");
                }
            }
        }

        if (!accessGranted) {
            System.out.println("Erişim engellendi.");
        } else {
            while (true) {
                System.out.println("1- Para çekme, 2-Bakiye sorma, 3-Para yatırma, 4-Çıkış, 5-İşlem Geçmişi");
                System.out.println("Bir işlem seçiniz: ");

                int select = scanner.nextInt();
                double tutar;
                String islemDetayi;

                switch (select) {
                    case 1: // Para çekme
                        System.out.println("Para tutarı giriniz: ");
                        tutar = scanner.nextDouble();
                        if (tutar > 0 && toplamBakiye >= tutar) {
                            toplamBakiye -= tutar;
                            System.out.println("Yeni bakiyeniz: " + toplamBakiye);
                            islemDetayi = LocalDate.now() + " - İşlem Türü: Para Çekme, Miktar: " + tutar + ", Yeni Bakiye: " + toplamBakiye;
                            islemGecmisi.add(islemDetayi);
                        } else {
                            System.out.println("Geçersiz tutar veya yetersiz bakiye.");
                        }
                        break;
                    case 2: // Bakiye sorma
                        System.out.println("Bakiyeniz: " + toplamBakiye);
                        islemDetayi = LocalDate.now() + " - İşlem Türü: Bakiye Sorgulama, Yeni Bakiye: " + toplamBakiye;
                        islemGecmisi.add(islemDetayi);
                        break;
                    case 3: // Para yatırma
                        System.out.println("Para tutarı giriniz: ");
                        tutar = scanner.nextDouble();
                        if (tutar > 0) {
                            toplamBakiye += tutar;
                            System.out.println("Yeni bakiyeniz: " + toplamBakiye);
                            islemDetayi = LocalDate.now() + " - İşlem Türü: Para Yatırma, Miktar: " + tutar + ", Yeni Bakiye: " + toplamBakiye;
                            islemGecmisi.add(islemDetayi);
                        } else {
                            System.out.println("Geçersiz tutar.");
                        }
                        break;
                    case 4: // Çıkış
                        System.out.println("Çıkış yaptınız.");
                        return;
                    case 5: // İşlem Geçmişi
                        if (islemGecmisi.isEmpty()) {
                            System.out.println("İşlem geçmişiniz bulunmamaktadır.");
                        } else {
                            System.out.println("İşlem Geçmişi:");
                            for (String islem : islemGecmisi) {
                                System.out.println(islem);
                            }
                        }
                        break;
                    default:
                        System.out.println("Yanlış tercih yaptınız.");
                        break;
                }
            }
        }
    }
}
