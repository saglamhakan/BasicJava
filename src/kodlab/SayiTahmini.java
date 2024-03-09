package kodlab;

import javax.swing.*;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int rastgeleSayi = (int) (Math.random()*10 + 1);
       System.out.println("1 ile 100 arası bir sayı giriniz");

       int tahminSayisi = 0;


       while (true){
           int tahmin = scanner.nextInt();
           tahminSayisi++;

           if (!(tahmin>0 && tahmin<100)){
               System.out.println("1 ile 100 arası sayı giriniz");
               continue;
           }if (tahmin == rastgeleSayi){
               System.out.println("Tebrikler bildiniz" + tahminSayisi + " . sayıda" );
           } else if (tahmin<rastgeleSayi) {
               System.out.println(tahminSayisi + ". Tahmininiz daha düşük");
           }else
               System.out.println(tahminSayisi + ". Tahmininiz daha büyük");
       }

    }
}
