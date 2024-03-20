package kodlab.dateTimeApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationClass {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.parse("2018-08-10");
        LocalDate yeniTarih = tarih.plus(Period.ofYears(1));  //Bir tarihin değerini değiştirmek ve aradaki farkı almak için kullanılır.
        System.out.println(yeniTarih);

        int tarihFark = (int) ChronoUnit.DAYS.between(tarih, yeniTarih);
        System.out.println(tarihFark);

        Period period = Period.of(1, 3, 5);
        LocalDate atama =  tarih.plus(period);
        System.out.println(atama);

        LocalTime zaman = LocalTime.of(8,15,40); //Saat cinsinden periodla aynı
        LocalTime yeniZaman = zaman.plus(Duration.ofMinutes(10));
        System.out.println(yeniZaman);

    }
}