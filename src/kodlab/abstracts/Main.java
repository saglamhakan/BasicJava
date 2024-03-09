package kodlab.abstracts;

public class Main {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        kopek.kos();


        Muzik muzik = new Muzik();
        muzik.isim("Hakkı");
        muzik.yil(1997);
        muzik.adet(12);

        Film film = new Film();
        film.isim("KVP");
        film.yil(2003);
        film.adet(14);

        muzik.bilgileriYazdir();
        film.bilgileriYazdir();
    }
}
