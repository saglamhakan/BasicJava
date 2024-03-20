package kodlab.dateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeClass {
    public static void main(String[] args) {
        ZoneId timeZone =  ZoneId.of("Europe/Berlin"); //Kıta ve Şehir ismi
        ZonedDateTime zonedDateTime = ZonedDateTime.now(timeZone);
        System.out.println(zonedDateTime);

        ZoneId.getAvailableZoneIds().forEach(System.out::println); //

        Set<String> tumZoneId = ZoneId.getAvailableZoneIds();
        System.out.println(tumZoneId);
    }
}
