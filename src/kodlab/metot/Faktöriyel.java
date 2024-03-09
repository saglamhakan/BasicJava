package kodlab.metot;

import java.util.Scanner;
public class Faktöriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        int sonuc = fact(sayi);  //number değerine bir argüman olarak girilir
        System.out.println(sonuc);

    }
   static int fact(int number) {
       int carpim = 1;
       for (int i = 1; i <= number; i++) {
           carpim *= i;
       }
            return carpim;
   }


    }


