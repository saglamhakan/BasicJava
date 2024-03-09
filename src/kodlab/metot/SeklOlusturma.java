package kodlab.metot;

public class SeklOlusturma {
    public static void main(String[] args) {
        char karakter = 'a';
        dikdortgenOlustur(karakter);
    }

    public static void dikdortgenOlustur(char karakter) {
        int satir = 5;
        int sutun = 10;

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (i == 0 || i == satir - 1 || j == 0 || j == sutun - 1) {
                    System.out.print(karakter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
