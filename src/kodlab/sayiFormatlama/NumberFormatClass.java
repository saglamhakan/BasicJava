package kodlab.sayiFormatlama;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getInstance().format(12345));

        System.out.println("-------------------------------");

        NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println(format.format(1234567));
    }
}
