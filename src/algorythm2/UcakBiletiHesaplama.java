package algorythm2;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        double km; //0.10
        double age;
        double journeyType;
        double fiyat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç km gideceksin: ");
        km = scanner.nextDouble();
        if (km<0){
            System.out.println("Hatalı veri girdiniz");
            return; //Hatalı veri girdikten sonra programı sonlandırmak için
        }
        System.out.println("Kaç yaşındasın: ");
        age = scanner.nextDouble();
        if (age<0){
            System.out.println("Hatalı veri girdiniz");
            return;
        }
        System.out.println("""
                Yolculuk tipi seçiniz:\s
                1-sadece gidiş
                2-GidişDönüş""");
        journeyType = scanner.nextDouble();
        if (!(journeyType == 1 || journeyType == 2)){
            System.out.println("Hatalı veri girdiniz");
            return;
        }
        fiyat = km*0.1;

        if (age<12){
            fiyat *= 0.5;
        } else if (age < 24) {
            fiyat*=0.9;
        } else if (age>65) {
            fiyat*=0.7;
        }
        if (journeyType == 2){
            fiyat *= 0.8;
            fiyat *= 2;
        }
        System.out.println("Toplam tutar: " + fiyat + " TL");
    }

}

