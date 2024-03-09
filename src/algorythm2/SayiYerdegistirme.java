package algorythm2;

import java.util.Scanner;

public class SayiYerdegistirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a sayısını giriniz: ");
        int a = scanner.nextInt();

        System.out.println("b sayısını giriniz: ");
        int b = scanner.nextInt();

        System.out.println("Değiştirilmeden önce: a = " + a + ", b = " + b);

        // Sayıların yerlerini değiştirme
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Değiştirildikten sonra: a = " + a + ", b = " + b);
    }
    }

