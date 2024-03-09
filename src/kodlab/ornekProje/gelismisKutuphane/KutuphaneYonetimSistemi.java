package kodlab.ornekProje.gelismisKutuphane;

import kodlab.ornekProje.kutuphaneSistemi.Kitap;

import java.util.ArrayList;
import java.util.List;

public class KutuphaneYonetimSistemi {

    List<Books> kitapList = new ArrayList<>();


    public void addBook(Books book){
        kitapList.add(book);

    }
    public void deleteBook(String ISBN){
        Books silinecekKitap = null;
        for (Books books: kitapList) {
            if (books.getISBN().equals(ISBN)){
                silinecekKitap = books;
                break;

            }
        }
        if (silinecekKitap != null) {
            kitapList.remove(silinecekKitap);
            System.out.println(ISBN + " numaralı kitap başarıyla silindi.");
        } else {
            System.out.println(ISBN + " numaralı kitap bulunamadı.");
        }
    }
    public void listBook(){
        for (Books book: kitapList) {
            book.bilgileriYazdir();
        }
    }
    public void searchBook(String ISBN){
        for (Books book:kitapList) {
            if (book.getISBN().equals(ISBN)){
                book.bilgileriYazdir();
            }


        }
    }
}
