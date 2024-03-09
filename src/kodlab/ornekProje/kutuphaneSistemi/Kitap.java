package kodlab.ornekProje.kutuphaneSistemi;

public class Kitap extends Yayin{

    private String yazar;

    public Kitap(String baslik, String yayinTarihi, String yazar) {
        super(baslik, yayinTarihi);
        this.yazar=yazar;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Kitap: " + baslik + ", Yazar: " + yazar + ", Yayın Tarihi: " + yayinTarihi);
    }
}
