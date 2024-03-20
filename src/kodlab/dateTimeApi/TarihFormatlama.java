package kodlab.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TarihFormatlama {
    public static void main(String[] args) {
        LocalDateTime trh = LocalDateTime.now();
        System.out.println(trh.format(DateTimeFormatter.ofPattern("d.MMMM.yyyy"))); // TARİHİ İSTEDİĞİMİZ FORMATTA YAZMAMIZI SAĞLADI
    }
}
