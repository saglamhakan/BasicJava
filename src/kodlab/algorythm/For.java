package kodlab.algorythm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class For {
    public static void main(String[] args) {
       int i =1;
       for (char x = 'a';  x<='e' ; x++){
         //  System.out.println("Alfabenin " + i + ".harfi = " + x);
           i++;
       }
        List<String> animal = Arrays.asList("Hakan", "mehmet", "hasan");
        for (String animals: animal){
           // System.out.println(animals);
        }

        int x = 0;
        while (true){
            if (x == 30){
               // System.out.println("30 a eşitlendi");
                break;
            }
            else {
             //   System.out.println(x);
                x++;
            }
        }
        for (int k = 1; k < 10; k++) {
            if (k%2==1){
                continue;
            }else {
              //  System.out.println(k + " sayısı 2 ye bölünür");
            }
        }
        int total = 1;
        for (int c = 1; c<=5; c++){
            total*=c;
            if (total == 6){
                break;
            }else {
                System.out.println(total);

            }
        }
    }

}
