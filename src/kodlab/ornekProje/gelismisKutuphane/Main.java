package kodlab.ornekProje.gelismisKutuphane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KutuphaneYonetimSistemi kutuphaneYonetimSistemi = new KutuphaneYonetimSistemi();
        Scanner scanner = new Scanner(System.in);

       boolean devamEt = true;
        while (devamEt){
            System.out.println("1- Kitap ekle -  2- Kitap sil - 3-Kitap listele - 4-arama yap - 5-Çıkış");
            int secim = scanner.nextInt();

            if (secim == 1){
                scanner.nextLine();
                System.out.print("Kitap İsmi Ekleyiniz : ");
                String bookName = scanner.nextLine();
                System.out.print("Yazar ekleyiniz : ");
                String writer = scanner.nextLine();
                System.out.print("ISBN Ekleyiniz : ");
                String ISBN = scanner.nextLine();
                Books book1 = new Books(bookName,writer,ISBN);
                kutuphaneYonetimSistemi.addBook(book1);
                System.out.println("Kitap başarıyla eklendi");

            } else if (secim == 2) {
                scanner.nextLine();
                System.out.print("ISBN giriniz : ");
                String ISBN = scanner.nextLine();

                kutuphaneYonetimSistemi.deleteBook(ISBN);
                System.out.println("Kitap başarıyla silindi : ");

            } else if (secim == 3) {
                kutuphaneYonetimSistemi.listBook();

            } else if (secim == 4) {
                scanner.nextLine();
                System.out.println("ISBN giriniz :");
                String ISBN = scanner.nextLine();
                kutuphaneYonetimSistemi.searchBook(ISBN);
            } else if (secim == 5) {
                devamEt = false;
                System.out.println("İşlem bitmiştir");
            }else {
                System.out.println("Hatalı sayı girdiniz: ");
            }
        }
       


    }
}
