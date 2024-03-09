package algorythm2;

import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String[] args) {

        int mat, turk, kim, muz, fiz;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("mat notu:");
        mat = scanner.nextInt();
        System.out.println("turk notu:");
        turk = scanner.nextInt();
        System.out.println("kim notu:");
        kim = scanner.nextInt();
        System.out.println("muz notu:");
        muz = scanner.nextInt();
        System.out.println("fiz notu:");
        fiz = scanner.nextInt();

        average = (double) (mat + kim + fiz + turk + muz) /5;

        if ((average >= 0) && (average<=100)){
            if (average>60){
                System.out.println("Geçtiniz");
            }else {
                System.out.println("Kaldınız");
            }
        }else {
            System.out.println("Yanlış puan girdiniz");
        }

    }
}
