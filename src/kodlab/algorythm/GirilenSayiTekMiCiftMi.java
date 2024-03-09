package kodlab.algorythm;

import javax.swing.*;

public class GirilenSayiTekMiCiftMi {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Sayı gir: "));

        if (a%2 == 0){
            String mesaj = a + " Çift sayıdır";
            JOptionPane.showMessageDialog(null, mesaj);
        }else{
            String mesaj = a + " Tek sayıdır";
            JOptionPane.showMessageDialog(null, mesaj);
        }
    }
}
