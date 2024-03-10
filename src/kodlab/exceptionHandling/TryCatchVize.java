package kodlab.exceptionHandling;

import java.util.Scanner;

public class TryCatchVize {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        int not = scanner.nextInt();
        System.out.println("Notunuz: " + not);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
