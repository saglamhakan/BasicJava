package kodlab.algorythm;

import java.util.Scanner;

public class Kodlab {
    public static void main(String[] args) {

    int x;
    int y;
    double select;

    Scanner scanner = new Scanner(System.in);
        System.out.println("x i gir: ");
        x = scanner.nextInt();
        System.out.println("y i gir: ");
        y = scanner.nextInt();
        System.out.println("Hangi işlem: 1-Toplama 2- Çıkarma 3-çarpma 4-bölme");
        select = scanner.nextDouble();

        switch ((int) select){
            case 1 :
                System.out.println("sonuç: " + (x+y));
                break;
            case 2:
                System.out.println("sonuç: " + (x-y));
                break;
            case 3:
                System.out.println("sonuç : " + x*y);
                break;
            case 4:
                if (y != 0){
                    System.out.println("sonuc : " + (x/y));

                }else {
                    System.out.println("0 a bölünemez");
                }
                break;
            default:
                System.out.println("geçersiz işlem");
        }
    }
}


