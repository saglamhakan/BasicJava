package kodlab.scanner;

import javax.swing.*;
import java.util.Random;

public class ScannerClass {
    public static void main(String[] args) {

        int i =1;
        int r = (int) (Math.random()*10+1);

        int sayi = r;

        while (true){
            String tahmin = JOptionPane.showInputDialog("Tahmin gir: ");
            int t = Integer.parseInt(tahmin);

            if (t==sayi){
                String mesaj = "Tahmin doğru!   - " +i+ ". tahminde bildiniz";
                JOptionPane.showMessageDialog(null, mesaj);
                break;
            }
            else
                i++;
        }


       // String sayi = JOptionPane.showInputDialog("Bir sayı girin");
        // System.out.println(sayi);

       // JOptionPane.showMessageDialog(null, "Bilgilendirme Mesajı", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
    }
}
