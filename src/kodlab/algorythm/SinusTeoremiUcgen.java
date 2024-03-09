package kodlab.algorythm;

import java.util.Scanner;

public class SinusTeoremiUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz: ");
        double a = scanner.nextDouble();
        System.out.println("İkinci kenarı giriniz: ");
        double b = scanner.nextDouble();
        System.out.println("Açıyı giriniz: ");
        double aci = scanner.nextDouble();

        double alan = a*b*Math.sin(aci*Math.PI/180)/2;
        System.out.println(alan);
    }
}
