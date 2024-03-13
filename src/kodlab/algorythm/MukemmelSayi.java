package kodlab.algorythm;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int girilenSayi = scanner.nextInt(); //scanner.nextInt();
        double toplam = 0;

        for (int i = 1; i < girilenSayi; i++) {
           if (girilenSayi % i == 0){
                toplam += i;
            }

        }
        if (girilenSayi == toplam){
            System.out.println(girilenSayi + " sayısı mükemmel sayıdır");
        }else
            System.out.println(girilenSayi + " mükemmel sayı değildir");
    }
}
