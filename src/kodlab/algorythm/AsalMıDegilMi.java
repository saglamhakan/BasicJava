package kodlab.algorythm;

import java.util.Scanner;

public class AsalMıDegilMi {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int girilenSayi = scanner.nextInt();
        int sayac = 0;

        for (int i = 1; i <= Math.sqrt(girilenSayi); i++) {
            if (girilenSayi%i == 0){
                sayac++;
            }
        }if (sayac == 2){
            System.out.println(girilenSayi + " sayısı asaldır");
        }else {
            System.out.println(girilenSayi + " asal değildir");
        }
    }
}
