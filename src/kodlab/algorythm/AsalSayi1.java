package kodlab.algorythm;

import java.util.Scanner;

public class AsalSayi1 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        x = scanner.nextInt();
        boolean asalMi = true;


        for (int sayi = 2; sayi <= Math.sqrt(x); sayi++) {
            if (x % sayi == 0) {
                asalMi = false;
                System.out.println("Asal değil");
                break;
            }
            }if (asalMi && x>1){
            System.out.println("Asal");

        }

    }

}