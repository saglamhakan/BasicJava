package kodlab.dateTimeApi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(); //yyyy-mm-dd formatında bugünün değerini verir
        System.out.println(localDate);

        localDate = LocalDate.of(1997, Month.DECEMBER, 22); //Hangi tarihi verirsek onu verir
        System.out.println(localDate);

        localDate = LocalDate.ofYearDay(2018,100); //Verilen tarihin hangi yılda hangi ay ve gün olduğunu verir
        System.out.println(localDate);



    }
}
