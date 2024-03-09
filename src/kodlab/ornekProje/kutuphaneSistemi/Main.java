package kodlab.ornekProje.kutuphaneSistemi;

public class Main {
    public static void main(String[] args) {
        YayinYonetimi yayinYonetimi = new YayinYonetimi();

        Dergi dergi = new Dergi("Kafa", "1990", "Nazım Hikmet");
        Gazete gazete = new Gazete("Sabah", "1990", "2002");
        Kitap kitap = new Kitap("Yabancı", "2001", "Albert Camus");

        yayinYonetimi.yayinEkle(dergi);
        yayinYonetimi.yayinEkle(gazete);
        yayinYonetimi.yayinEkle(kitap);

        yayinYonetimi.yayinSil(dergi);

        yayinYonetimi.yayinListele();

    }
}
