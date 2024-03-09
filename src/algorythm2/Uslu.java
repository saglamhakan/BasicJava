package algorythm2;

import java.util.Scanner;

public class Uslu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini almak için girişler istenir.
        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        // Kombinasyonu hesaplamak için gerekli olan faktöriyel değerler hesaplanır.
        int nFaktoriyel = faktoriyel(n);
        int rFaktoriyel = faktoriyel(r);
        int nEksiRFaktoriyel = faktoriyel(n - r);

        // C(n, r) = n! / (r!(n-r)!) formülü kullanılarak kombinasyon hesaplanır.
        int kombinasyon = nFaktoriyel / (rFaktoriyel * nEksiRFaktoriyel);

        // Hesaplanan kombinasyon sonucu ekrana yazdırılır.
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    // Bir sayının faktöriyelini hesaplayan yardımcı metod
    public static int faktoriyel(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
