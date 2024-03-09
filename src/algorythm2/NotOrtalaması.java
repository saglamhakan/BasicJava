package algorythm2;

import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {

        double mat, turk, kim, tar, muz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Türkçe notunuzu giriniz: ");
        turk = scanner.nextDouble();
        System.out.println("mat notunuzu giriniz: ");
        mat = scanner.nextDouble();
        System.out.println("kimya notunuzu giriniz: ");
        kim = scanner.nextDouble();
        System.out.println("Müzik notunuzu giriniz: ");
        muz = scanner.nextDouble();
        System.out.println("Tarih notunuzu giriniz: ");
        tar = scanner.nextDouble();

        double average = (mat + turk +kim+ tar + muz)/5;
            System.out.println(average >= 60 ? "Geçtiniz " + average : "Kaldınız");

        }



    }

