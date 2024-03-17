package kodlab.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class IsciMain {
    public static void main(String[] args) {

        List<Isci> isciListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Yaş giriniz: ");
            int yas = scanner.nextInt();
            scanner.nextLine();
            System.out.print("İsim giriniz: ");
            String isim = scanner.nextLine();
            System.out.print("Maaş giriniz: ");
            int maas = scanner.nextInt();
            scanner.nextLine();

            Isci isci = new Isci(yas,isim,maas);
            isciListesi.add(isci);
        }

        isciListesi.sort(Comparator.comparing(Isci::getIsim));

        isciListesi.forEach(System.out::println);

        scanner.close();
    }


    }

