package kodlab.algorythm;

import java.util.Scanner;

public class SayiyiTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scanner.nextInt();
        int total;

        while (sayi!=0){
            total = sayi%10;
            sayi/=10;
            System.out.print(total);

          //  System.out.println(sayi%10);
           // sayi/=10;

        }
    }
}
