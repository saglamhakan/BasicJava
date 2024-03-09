package kodlab.algorythm;

import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        double a;
        double b;
        double hipo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("a kenarını giriniz: ");
        a = scanner.nextInt();
        System.out.println("b kenarını giriniz: ");
        b = scanner.nextInt();

        hipo = Math.sqrt(a*a + b*b);
        System.out.println(hipo);
    }
}
