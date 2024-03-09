package kodlab.algorythm;

import java.util.Scanner;

public class GeometrikOrtalamaHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = 0, sayi, ort=1;

        do {
            System.out.println("Bir sayı giriniz çıkmak için 0 a basınız: ");
            sayi = scanner.nextInt();
            if (sayi!=0){
                ort*=sayi;
                n++;
            }
        }while (sayi!=0);
            ort  =  Math.pow(ort, 1.0/n);
            System.out.println("Geometrik ortalama: " + ort);
        }

    }


