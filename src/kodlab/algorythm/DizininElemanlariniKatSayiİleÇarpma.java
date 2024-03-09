package kodlab.algorythm;

import java.util.Scanner;

public class DizininElemanlariniKatSayiİleÇarpma {
    public static void main(String[] args) {
        double a[] = {100,100,100,100,100,100,100,1001,100,100};
        double[] b = new double[a.length];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Katsayı giriniz: ");
        int k = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < a.length; i++) {
           b[i] = a[i]*k;
        }
        System.out.println("b Dizisinin Elemanları (Yeni Değerler):");
        for (double i: b) {
            System.out.println(i);

        }
        }
        /*
        System.out.println("\tEski\tYeni\tzam\n\n");
        for (int i = 0; i < a.length; i++) {
            System.out.println("\t" + a[i] + "TL\t(" + (b[i] - a[i]) + "tl)");

        }

         */


    }


