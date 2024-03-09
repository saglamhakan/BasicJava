package algorythm2;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        double x;
        double y;
        int select;

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        x = scanner.nextDouble();;
        System.out.println("İkinci Sayıyı giriniz: ");
        y = scanner.nextDouble();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4- Bölme");
        System.out.println("Seçiminiz : ");
        select = scanner.nextInt();

        if (select == 1){
            System.out.println(x+y);
        } else if (select == 2) {
            System.out.println(x-y);
        }else if (select == 3){
            System.out.println(x*y);
        }else if(select == 4){
            if (y == 0){
                System.out.println("Sıfıra bölünemez");
            }else{
            System.out.println(x/y);
        }
            }else
            System.out.println("Yanlış seçim yaptınız");
    }
}
