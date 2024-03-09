package kodlab.abstracts;

public class Muzik extends Medya{
    @Override
    public void isim(String medyaBasligi) {
        this.medyaBasligi=medyaBasligi;
    }

    @Override
    public void yil(int cikisYolu) {
        this.cikisYolu=cikisYolu;

    }

    @Override
    public void adet(int satisAdedi) {
        this.satisAdedi=satisAdedi;
    }

    public void bilgileriYazdir() {
        System.out.println("Film Başlığı: " + medyaBasligi + ", Yılı: " + satisAdedi + ", Adet: " + cikisYolu);
    }
}
