package kodlab.exceptionHandling;

import java.util.Scanner;

public class SadeceKarakterAlanUygulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Harfleri girin (Çıkmak için q girin): ");

        while (true) {
            try {
                char letter = readLetter(scanner);
                if (letter == 'q') {
                    break;
                }
                System.out.println("Girilen harf: " + letter);
            } catch (NotALetterException e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }
    }

    public static char readLetter(Scanner scanner) throws NotALetterException {
        String input = scanner.next();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            throw new NotALetterException("Geçersiz karakter: Yalnızca harfler kabul edilir.");
        }
        return input.charAt(0);
    }
}
