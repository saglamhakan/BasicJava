package kodlab.metot;

import java.util.Scanner;

public class TersCevir {
   public static String tersCevir(String metin){
       return new StringBuilder(metin).reverse().toString();
       
    }

    public static void main(String[] args) {
        String yazi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        yazi = scanner.nextLine();

        System.out.println(tersCevir(yazi) + " " + yazi);




    }
}
