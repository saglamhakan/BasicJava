package kodlab.algorythm;

import java.util.Scanner;

public class BasamakDegerleriToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamak değerlerinin toplamı: " + toplam);

        int x =3^2;

        System.out.println(x);
    }


    }

