package kodlab.ornekProje.okulYonetimSistemi;

public class Main {
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen("Hakan ", "Sağlam ", 64726370410L, " Odyoloji");
        Ogrenci ogrenci = new Ogrenci("Mürsel ", "Kaya ", 3114576465L, 311  );

        KisiYonetim kisiYonetim = new KisiYonetim();
        kisiYonetim.ogretmenEkle(ogretmen);
        kisiYonetim.ogrenciEkle(ogrenci);

        kisiYonetim.ogrenciSil(ogrenci);

        kisiYonetim.ogretmenListele();
        kisiYonetim.ogrenciListele();


    }
}
