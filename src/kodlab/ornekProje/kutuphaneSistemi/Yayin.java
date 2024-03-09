package kodlab.ornekProje.kutuphaneSistemi;

public abstract class Yayin {

    public  String baslik;
    public  String yayinTarihi;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(String yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    public Yayin(String baslik, String yayinTarihi) {
        this.baslik = baslik;
        this.yayinTarihi = yayinTarihi;
    }
    public abstract void bilgileriYazdir();
}
