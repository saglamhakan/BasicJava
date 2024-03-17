package kodlab.collections;

import java.util.Arrays;
import java.util.List;

public class KosulaGoreFiltreleme {
    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> ciftSayilar = sayilar.stream()
                .filter(sayi -> sayi % 2 == 0)
                .toList();
        ciftSayilar.forEach(System.out::println);

    }
}
