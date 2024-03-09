package algorythm2;

import java.util.Scanner;

public class GirilenSayıdankÜÇÜK2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i=1; i<n; i*=2){
            System.out.println(i);
        }
    }
}
