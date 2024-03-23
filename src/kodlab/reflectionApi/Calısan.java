package kodlab.reflectionApi;

public class Calısan {
    private String adSoyad;
    private int yas;
    private double maas;
    private char cinsiyet;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public char getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(char cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Calısan(String adSoyad, int yas, double maas, char cinsiyet) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.maas = maas;
        this.cinsiyet = cinsiyet;
    }
}
