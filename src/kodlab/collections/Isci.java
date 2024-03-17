package kodlab.collections;

public class Isci {
    private int yas;
    private String isim;
    private int maas;

    public Isci(int yas, String isim, int maas) {
        this.yas = yas;
        this.isim = isim;
        this.maas = maas;
    }

    // Getter ve Setter metodları
    public int getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public int getMaas() {
        return maas;
    }

    // toString() metodunu override ederek, Isci nesnesinin bilgilerini yazdırmak için kullanabiliriz.
    @Override
    public String toString() {
        return "Isci{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                ", maas=" + maas +
                '}';
    }
}
