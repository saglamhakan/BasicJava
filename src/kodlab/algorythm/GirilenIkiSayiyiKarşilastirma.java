package kodlab.algorythm;

import javax.swing.*;

public class GirilenIkiSayiyiKarşilastirma {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Sayı gir: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Sayı gir: "));

        if (a>b){
            JOptionPane.showMessageDialog(null, "A, b'den büyük");
        } else if (b>a) {
            JOptionPane.showMessageDialog(null,"B, A'dan büyük");

        }else {
            JOptionPane.showMessageDialog(null, "İki sayı eşit");
        }


    }
}
