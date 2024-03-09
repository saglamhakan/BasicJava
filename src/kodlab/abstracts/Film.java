package kodlab.abstracts;

public class Film extends Medya{
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

    public void bilgileriYazdir(){
        System.out.println("Medya başlığı = " + medyaBasligi + " Çıkış yılı = " + cikisYolu + " Satış adedi = " + satisAdedi);
    }
}
