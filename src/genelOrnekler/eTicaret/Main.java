package genelOrnekler.eTicaret;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CartManager cartManager = new CartManager();
        OrderManager orderManager = new OrderManager(cartManager);
        ProductManager productManager = new ProductManager(); // Ürün yönetimi için

        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            System.out.println("İşlem Seçiniz: ");
            System.out.println("1- Ürün Ekle");
            System.out.println("2- Ürün Sil");
            System.out.println("3- Sepeti Görüntüle");
            System.out.println("4- Sipariş Ver");
            System.out.println("5- Çıkış");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Ürün ID giriniz: ");
                    int id = scanner.nextInt();
                    System.out.println("Ürün Adı: ");
                    String ad = scanner.next();
                    System.out.println("Fiyat: ");
                    double fiyat = scanner.nextDouble();
                    System.out.println("Stok Miktarı: ");
                    int stokMiktari = scanner.nextInt();

                    Product urun = new Product(id, ad, fiyat, stokMiktari);
                    cartManager.addProductToCart(urun);
                    System.out.println(ad + " sepete eklendi.");
                    break;
                case 2:
                    System.out.println("Silmek istediğiniz ürünün ID'sini giriniz: ");
                    int silinecekId = scanner.nextInt();
                    cartManager.deleteProductFromCart(silinecekId);
                    break;
                case 3:
                    // Sepeti Görüntüle
                    cartManager.tutarHesapla();
                    break;
                case 4:
                    // Sipariş Ver
                    orderManager.siparisOlustur();
                    break;
                case 5:
                    // Çıkış
                    devam = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz.");
                    break;
            }
        }

        scanner.close();
    }

    }
