package kodlab.metot;

public class StringİfadeMetot {

    public static String adi;
    public static String soyadi;
    public static void degerAl(String ad, String soyad){
        adi = ad;
        soyadi = soyad;
    }

    static void yazdır(){
        System.out.println("Tam isim : " + adi + soyadi);
    }

    public static void main(String[] args) {
        degerAl("Hakan ", "Mehmet");
        yazdır();
    }
}
