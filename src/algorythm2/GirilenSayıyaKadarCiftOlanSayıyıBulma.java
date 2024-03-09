package algorythm2;

import java.util.Scanner;

public class GirilenSayıyaKadarCiftOlanSayıyıBulma {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i<=n; i+=2){
            System.out.println(i);
        }
    }
}
