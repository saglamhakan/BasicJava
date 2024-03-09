package kodlab;

import java.util.Scanner;

public class FaktorBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int girilenSayi = scanner.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (girilenSayi%i == 0){
                System.out.println(i);

            }

        }
    }
}
