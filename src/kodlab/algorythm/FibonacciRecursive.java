package kodlab.algorythm;

import java.util.Scanner;

public class FibonacciRecursive {  //Çok anlamadım :)

    static int fib(int n){
        if (n==2 || n==1){
            return 1;
        }else {
            return fib(n-2) + fib(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıra sayısını (n) giriniz: ");
        int n = scanner.nextInt();
        int sonuc = fib(n);
        System.out.println("Sonuç = " + sonuc);
    }
}
