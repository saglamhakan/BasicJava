package kodlab.oop;

import java.util.Scanner;

public class Isci {

    String ad, soyad,sehir, gorev;
    int maas;

    public Isci(String ad, String soyad, String sehir, String gorev, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.sehir = sehir;
        this.gorev = gorev;
        this.maas = maas;
    }

    void bilgileriYazdir(){
        System.out.println("Ad " + ad);
        System.out.println("Soyad " + soyad);
        System.out.println("Şehir " + sehir);
        System.out.println("Görev " + gorev);
        System.out.println("Maaş " + maas);
    }

    public static void main(String[] args) {
        Isci isci = new Isci("Hakan", "Sağlam", "Adana", "Developer", 50000);
        isci.bilgileriYazdir();
    }
}
