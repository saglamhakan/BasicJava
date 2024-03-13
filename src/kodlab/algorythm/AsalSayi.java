package kodlab.algorythm;


public class AsalSayi {
    public static void main(String[] args) {

        for (int sayi = 20; sayi < 90; sayi++) {
            boolean asalMi = true;
            for (int bolen = 2; bolen < Math.sqrt(sayi) ; bolen++) { // 2 den o sayının kareköküne kadar olan her sayıyı döner
                if (sayi%bolen == 0){

                    asalMi = false;
                    break;
                }

                }if (asalMi && sayi>1){
                System.out.println("Sayı asal: " + sayi);

            }
            int a =1, b=2, c=3, d=4, e=5;
            System.out.println(Math.max(a,b));
        }


           }

        }


