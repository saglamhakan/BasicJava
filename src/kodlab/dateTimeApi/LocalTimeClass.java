package kodlab.dateTimeApi;

import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); //şimdinin saatini verir
        System.out.println(localTime);

        localTime = LocalTime.of(14,53); //İstediğimiz saati verir
        System.out.println(localTime);

        localTime = LocalTime.ofSecondOfDay(2220); //2220. saniyenin günün hangi saatine geldiğini gösterir
        System.out.println(localTime);
    }
}
