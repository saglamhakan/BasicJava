package kodlab.metot;

import java.util.Scanner;

public class DiziİsimYazdirma {
    public static void main(String[] args) {
        String dizi[] = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". ismi girin");
            dizi[i] = scanner.nextLine();
        }
        yazdir(dizi);
    }
    static void yazdir(String dizi[]){
        System.out.println("İsimler :");
        for (String i: dizi) {
            System.out.println(i);
        }
    }
}
