package algorythm2;

import java.util.Scanner;

public class DikÜcgen {
    public static void main(String[] args) {

        double a;
        double b;
        double c;


        Scanner scanner = new Scanner(System.in);
        System.out.println("a kenarını giriniz");
        a = scanner.nextDouble();
        System.out.println("b kenarını giriniz");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b))  ;

        System.out.println("hipotenüs: " + c);

    }
}
