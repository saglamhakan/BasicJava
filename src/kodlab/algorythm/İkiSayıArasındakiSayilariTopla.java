package kodlab.algorythm;

import java.util.Scanner;

public class İkiSayıArasındakiSayilariTopla {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int x = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int y = scanner.nextInt();
        System.out.print("Adim degerini giriniz: ");
        int adim = scanner.nextInt();

        for (int i = x; i <= y; i+=adim) { //ideğerinin ne kadar artacağını belirler
            total += i;

        }
        System.out.println("Toplam sayi: " + total);
/*
        for (int i = 0; i <= 6; i+=3) {
            System.out.println(i);
        }

 */
    }
}
