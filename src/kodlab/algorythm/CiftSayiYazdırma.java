package kodlab.algorythm;

import java.util.Scanner;

public class CiftSayiYazdırma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
