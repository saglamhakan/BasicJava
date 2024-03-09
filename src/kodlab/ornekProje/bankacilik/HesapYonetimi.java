package kodlab.ornekProje.bankacilik;

import java.util.Scanner;

public class HesapYonetimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoş geldiniz! Lütfen hesap numaranızı giriniz:");
        String hesapNo = scanner.nextLine();
        Hesap hesap = new Hesap(hesapNo);

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1- Para Yatırma");
            System.out.println("2- Para Çekme");
            System.out.println("3- Bakiye Sorgulama");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırılacak miktarı giriniz: ");
                    double yatirilacakMiktar = scanner.nextDouble();
                    hesap.paraYatir(yatirilacakMiktar);
                    break;
                case 2:
                    System.out.print("Çekilecek miktarı giriniz: ");
                    double cekilecekMiktar = scanner.nextDouble();
                    hesap.paraCek(cekilecekMiktar);
                    break;
                case 3:
                    hesap.bakiyeSorgula();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        }
    }


}
