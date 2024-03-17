package genelOrnekler.bankaUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountMovement accountMovement = new AccountMovement();
        Customer customer = new Customer("1234","Hakan", 27, "Developer");
        accountMovement.musteriEkle(customer.getTckn(), customer);

        accountMovement.musteriBul("1234");

        while (true) {
            System.out.println("1-Para yatırma\n2-Para çekme\n3-Bakiye Sorgulama\n4-Para transferi\n5-Çıkış");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("Tutar giriniz: ");
                int enterMoney = scanner.nextInt();
                accountMovement.paraYatir(enterMoney);

            } else if (secim == 2) {
                System.out.println("Çekilecek tutarı giriniz: ");
                int cekilecekTutar = scanner.nextInt();
                accountMovement.paraCek(cekilecekTutar);

            } else if (secim == 3) {
                System.out.println("Bakiyeniz: ");
                accountMovement.bakiyeSorgulama();

            }
        }
    }
}