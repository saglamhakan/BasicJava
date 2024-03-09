package kodlab.algorythm;

import java.util.Scanner;

public class MetotFaktoriyel {

    public static int fact(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= sayi; i++) {
            total *= i;
        }
       return total;
    }

    public static void main(String[] args) {
        System.out.println(fact());

    }
}
