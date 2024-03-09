package kodlab.algorythm;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x değerini giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("y değerini giriniz: ");
        int üs = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= üs ; i++) {
            total=taban*total;
        }
        System.out.println(total);



    }

}
