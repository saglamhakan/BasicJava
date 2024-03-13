package kodlab.algorythm;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int x =1;

       while (x>0){
          // System.out.println(x);
           x++;
       }
        int sayi = 5;
        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.println("Faktöriyel: " + faktoriyel);

    }
}
