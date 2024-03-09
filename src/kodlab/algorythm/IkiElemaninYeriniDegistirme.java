package kodlab.algorythm;

import java.util.Scanner;

public class IkiElemaninYeriniDegistirme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dizi[] = {1,3,5,7};
        System.out.println("Birinci indisi giriniz: ");
        int a = scanner.nextInt();
        System.out.println("İkinci indisi giriniz: ");
        int b = scanner.nextInt();

        int temp = dizi[a];
        dizi[a] = dizi[b];
        dizi[b] = temp;

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
