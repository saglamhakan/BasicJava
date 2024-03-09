package kodlab.algorythm;

import java.util.Scanner;

public class KmToMil {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Km giriniz: ");
        x = scanner.nextInt();

        double total;

        total = x*0.621;

        System.out.println(total);


    }
}
