package kodlab.algorythm;

import java.util.Scanner;

public class AsalSayiListeleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("2 ile " + sayi + " arasındaki asal sayılar:");
        for (int i = 2; i <= sayi; i++) {
            if (asalMi(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean asalMi(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
