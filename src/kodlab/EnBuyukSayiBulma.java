package kodlab;

import java.util.Scanner;

public class EnBuyukSayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int enBuyuk =  Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <=3 ; i++) {
            System.out.println(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi>enBuyuk){
                enBuyuk = sayi;
        }if (sayi<enKucuk){
                enKucuk = sayi;

        }
        }

        System.out.println(enBuyuk + " = en büyük sayı");
        System.out.println(enKucuk + " = en küçük sayı");
    }
}
