package algorythm2;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        double x1;
        double x2;
        double select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        x1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        x2 = input.nextDouble();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiminizi giriniz : " );
        select=input.nextInt();

        if (select == 1){
            System.out.println("Toplam sayı = " + ( x1+ x2));
        } else if (select == 2) {
            System.out.println("Sonuç = " + (x1 - x2));

        } else if (select == 3) {
            System.out.println("Sonuç = " + (x1*x2));

        } else if (select == 4) {
            if (x2 == 0){
                System.out.println("Hiçbir sayı 0 a bölünemez");
            }else {
                System.out.println("Sonuç = " + (x1/x2));
            }

        }else {
            System.out.println("Hatalı tuşlama");
        }


    }
}
