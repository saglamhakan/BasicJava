package kodlab.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ornek {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream() // Stream oluştur
                .map(n -> n * n) // Her bir öğenin karesini al
                .collect(Collectors.toList()); // Sonuçları bir liste olarak topla
        System.out.println(squaredNumbers);

        List<String> names = List.of("Hakan", "Mehmet", "Hasan");
        List<Integer> nameLength = names.stream().map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLength);

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> ciftSayi = number.stream()
                .filter(n -> n % 2 == 0) //map bir dönüşüm için kullanılırken filter bir filtreleme aracıdır. Yani filter true olanları döner
                .collect(Collectors.toList());
        System.out.println(ciftSayi);

        List<String> words = Arrays.asList("Hakan", "Mehmet", "Hasan");
        List<Character> initials = words.stream().map(word -> word.charAt(0))
                .collect(Collectors.toList());
        System.out.println(initials);

    }
}
