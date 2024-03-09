package kodlab.algorythm;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban değeri : ");
        int n1 = scanner.nextInt();
        System.out.println("Üs değeri");
        int n2 = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= n2; i++) {
        total   *= n1 ;

        }
        System.out.println(total);

    }
}
