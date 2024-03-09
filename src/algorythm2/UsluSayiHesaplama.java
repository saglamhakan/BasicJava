package algorythm2;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n1;
        int n2;
        int sonuc = 1;

        Scanner scanner = new Scanner(String.valueOf(System.in));
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        for (int i =1; i<=n2; i++){
            sonuc *= n1;
        }
        System.out.println(sonuc);
    }
}
