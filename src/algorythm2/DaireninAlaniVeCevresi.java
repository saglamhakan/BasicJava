package algorythm2;

import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args) {

        double pi = 3.14, r, alan, cevre, a, dilimAlan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        r = scanner.nextDouble();
        System.out.println("a değerini giriniz");
        a = scanner.nextDouble();

        alan = pi*r*r;
        cevre = 2*pi*r;
        dilimAlan = (pi*r*r*a)/360;

        System.out.println("Alan: " + alan + " " + "Çevre: " + cevre + " " + "Dilim alan" + dilimAlan);



    }
}
