package algorythm2;

import java.util.Scanner;

public class KdvTutarHesaplama {
    public static void main(String[] args) {

        double money;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        money = scanner.nextDouble();

        if (money < 1000 && money > 0 ){
            double KDVLİtutar = (money*18)/100 + money;
            System.out.println("KDVLİ tutar: " + KDVLİtutar);
        }else {
            double KDVLİtutar = (money*8)/100;
            System.out.println(KDVLİtutar);
        }


    }
}
