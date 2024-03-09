package kodlab.algorythm;

import java.util.Arrays;
import java.util.Scanner;

public class SayilariDiziyeAktarma {
    public static void main(String[] args) {
        int dizi[] = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            System.out.print("Sayı giriniz: ");
            dizi[i] = scanner.nextInt();

        }
        System.out.println(Arrays.stream(dizi).average()); //ortalama bulduk

    }
}
