package kodlab.ornekProje.havaDurumu;

import java.util.Random;

public class HavaDurumu {

    private int sicaklik;
    private int nemOrani;

    private int yagişIhtimali;

    public HavaDurumu() {
        this.sicaklik = uretSicaklik();
        this.nemOrani = uretNemOrani();
        this.yagişIhtimali = uretYagisIhtimali();
    }
    private int uretSicaklik() {
        Random rnd = new Random();
        return rnd.nextInt(41) - 10; // -10 ile 30 derece arasında rastgele sıcaklık üretir
    }

    private int uretNemOrani() {
        Random rnd = new Random();
        return rnd.nextInt(101); // 0 ile 100 arasında rastgele nem oranı üretir
    }

    private int uretYagisIhtimali() {
        Random rnd = new Random();
        return rnd.nextInt(101); // 0 ile 100 arasında rastgele yağış ihtimali üretir
    }

    public void bilgileriYazdir() {
        System.out.println("Sıcaklık: " + sicaklik + "°C");
        System.out.println("Nem Oranı: %" + nemOrani);
        System.out.println("Yağış İhtimali: %" + yagişIhtimali);
    }
}
