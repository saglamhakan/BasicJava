package kodlab;

import java.util.Scanner;

public class BesSayiToplama {
    public static void main(String[] args) {
        double toplam = 0;
        double sayi ;
       Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i + ". sayıyı giriniz");
            sayi = scanner.nextDouble();
            if (sayi>0){
                toplam += sayi;
            }
        }

        System.out.println(toplam);

    }
}
