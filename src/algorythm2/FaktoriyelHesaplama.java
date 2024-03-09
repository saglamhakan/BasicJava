package algorythm2;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        int n;
        int total =1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i<=n; i++){
            total = i*total;
        }
        System.out.println(total);

    }
}
