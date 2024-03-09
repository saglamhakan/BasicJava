package kodlab.algorythm;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();
        int t1=1, t2 = 1, t3;
        System.out.print("\n\t" + t1 + "\t" +t2);
        for (int i = 1; i <= n-2; i++) {
            t3 = t1+t2;
            System.out.print("\t" + t3);
            t1=t2;
            t2=t3;

        }




    }
}
