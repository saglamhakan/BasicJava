package kodlab.sayiFormatlama;

import java.util.Locale;

public class LocaleKavrami {
    public static void main(String[] args) {

        Locale[] locale = Locale.getAvailableLocales();

        for (Locale local: locale) {
            System.out.println(local + " " + local.getDisplayName());
        }

    }


}
