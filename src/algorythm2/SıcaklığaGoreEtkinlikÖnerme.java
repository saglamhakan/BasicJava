package algorythm2;

import java.util.Scanner;

public class SıcaklığaGoreEtkinlikÖnerme {
    public static void main(String[] args) {
        int temperature;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        temperature = scanner.nextInt();

        if (temperature<5){
            System.out.println("kayağa gidiniz");
        } else if (temperature<=25) {
          if (temperature <= 15){
              System.out.println("Sinemaya git");
          }if (temperature>=10){
                System.out.println("Pikniğe git");
            }

            }else  {
            System.out.println("yüzmeye git");

        }
    }
}
