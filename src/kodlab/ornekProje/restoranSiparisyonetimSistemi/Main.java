package kodlab.ornekProje.restoranSiparisyonetimSistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(); // Yemeklerin saklandığı menü nesnesi
        Siparis siparis = new Siparis(); // Kullanıcının siparişi

        // Menüye bazı örnek yemekler ekleyin (Burada varsayılan olarak eklenmiştir)
        menu.addFood(new Food("Hamburger", 15.0));
        menu.addFood(new Food("Pizza", 20.0));
        menu.addFood(new Food("Salata", 10.0));

        boolean devamEt = true;
        while (devamEt) {
            System.out.println("1- Menüyü Göster");
            System.out.println("2- Yemek Seç");
            System.out.println("3- Siparişten Yemek Çıkar");
            System.out.println("4- Sipariş Özetini Göster");
            System.out.println("5- Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    menu.menuGoster();
                    break;
                case 2:
                    System.out.print("Seçmek istediğiniz yemeğin adını girin: ");
                    scanner.nextLine(); // Girdi akışındaki yeni satırı temizle
                    String yemekAdi = scanner.nextLine();
                    Food secilenYemek = menu.searchFood(yemekAdi);
                    if (secilenYemek != null) {
                        siparis.addFood(secilenYemek);
                        System.out.println(yemekAdi + " siparişinize eklendi.");
                    } else {
                        System.out.println("Yemek menüde bulunamadı.");
                    }
                    break;
                case 3:
                    System.out.print("Çıkarmak istediğiniz yemeğin adını girin: ");
                    scanner.nextLine(); // Girdi akışındaki yeni satırı temizle
                    String cikarilacakYemekAdi = scanner.nextLine();
                    siparis.yemekCikar(cikarilacakYemekAdi);
                    break;
                case 4:
                    siparis.summarySiparis();
                    break;
                case 5:
                    devamEt = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
        scanner.close();
    }

    }

