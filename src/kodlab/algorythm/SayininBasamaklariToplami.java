package kodlab.algorythm;

import java.util.Scanner;

public class SayininBasamaklariToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scanner.nextInt();
        int total = 0;


        while (sayi!=0){
             total = sayi%10 + total; //total = 3
             sayi= sayi/10; //sayı = 12

        }
        System.out.println(total);


    }
}
