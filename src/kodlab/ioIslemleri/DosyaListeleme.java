package kodlab.ioIslemleri;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosyaListeleme {
    public static void main(String[] args) throws IOException {
        Path dizinYolu = Paths.get("/Users/hakansaglam/Desktop");

        // Dizindeki dosya ve dizinleri listele
        try {
            Files.list(dizinYolu)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Dizin listelenirken bir hata meydana geldi.");
            e.printStackTrace();
        }


    }
}
