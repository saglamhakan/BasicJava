package kodlab.dateTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); //Gün + saat şeklinde şimdinin tarihini verir
        System.out.println(localDateTime);

        localDateTime = localDateTime.plusDays(2).plusMinutes(20); //şimdinin 2 gün ve 20 dakika sonrasını verir
        System.out.println(localDateTime);

    }
}
