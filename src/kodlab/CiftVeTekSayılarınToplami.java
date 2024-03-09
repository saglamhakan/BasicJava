package kodlab;

import java.util.Scanner;

public class CiftVeTekSayılarınToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int tek = 0;
        int cift = 0;

        for (int i =1; i<=5; i++){
            System.out.println("Sayi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi%2 ==0){
                cift++;
            }else {
                tek++;
            }
        }
        System.out.println("Toplam Çift sayı: " + cift);
        System.out.println("Toplam tek sayı: " + tek);
    }
}