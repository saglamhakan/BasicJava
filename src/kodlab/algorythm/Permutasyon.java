package kodlab.algorythm;

import java.util.Scanner;

public class Permutasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = scanner.nextInt();
        System.out.print("Seçim sayısını giriniz: ");
        int r = scanner.nextInt();
        int permutation;
        int nfact = 1;
        int rfact = 1;

        for (int i = 1; i <=n ; i++) {
            nfact *=i;
        }
       // System.out.println(nfact);

        for (int i = 1; i <=n-r ; i++) {
            rfact *= i;

        }
      //  System.out.println(rfact);

        permutation = nfact/rfact;
        System.out.println(permutation);

    }
}
