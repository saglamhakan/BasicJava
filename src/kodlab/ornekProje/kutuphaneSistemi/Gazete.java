package kodlab.ornekProje.kutuphaneSistemi;

public class Gazete extends Yayin{

    private String basimTarihi;

    public Gazete(String baslik, String yayinTarihi, String basimTarihi) {
        super(baslik, yayinTarihi);
        this.basimTarihi = basimTarihi;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Başlık " + baslik + "Yayın Tarihi :" + yayinTarihi + "Basım Tarihi :" + basimTarihi);

    }
}
