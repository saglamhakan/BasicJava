package algorythm2;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km;
        double perKm = 2.20;
        double total = 10;

        Scanner  scanner = new Scanner(System.in);
        System.out.println("KM giriniz");
        km = scanner.nextDouble();;

        total += (km*perKm);  //+= totale ekle demek

        total = (total<20) ? 20 : total;
        System.out.println(total);
    }
}
