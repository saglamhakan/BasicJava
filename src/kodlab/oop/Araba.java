package kodlab.oop;

public class Araba {
    String marka, renk;
    void gazaBas(){
        System.out.println("Araba hızlanıyor: ");
    }
    void freneBas(){
        System.out.println("Araba yavaşlıyor: ");
    }

    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.marka = "BMW";
        araba.renk = "Kırmızı";
        araba.freneBas();
        araba.gazaBas();
    }
}
