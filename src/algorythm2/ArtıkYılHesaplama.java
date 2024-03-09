package algorythm2;

import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {

            int yil;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Yıl Giriniz: ");
            yil = scanner.nextInt();

            // Artık yıl kontrolü
            if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        }
    }

