package kodlab.algorythm;

import java.util.Scanner;

public class GirilenSayininBolumundenKalan {
    public static void main(String[] args) {
        int n1;
        int n2;


           while (true){
               Scanner scanner = new Scanner(System.in);
               System.out.print("n1 değerini giriniz: ");
               n1 = scanner.nextInt();
               System.out.print("n2 değerini giriniz: ");
               n2 = scanner.nextInt();
               if (!(n1 == 0 || n2 == 0)){
                   int total =  n1 % n2 ;
                   System.out.println("Kalan değer: " + total);
                   break;
               }else {
                   System.out.print("Program bitmiştir");
                   break;
               }
           }

    }
}
