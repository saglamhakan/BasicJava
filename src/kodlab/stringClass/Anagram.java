package kodlab.stringClass;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        // Boşlukları kaldır ve küçük harfe çevir
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Uzunlukları kontrol et
        if (s1.length() != s2.length()) {
            return false;
        }

        // Harf dizilimlerini sırala
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Sıralanmış dizilimleri karşılaştır
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        System.out.println(str1 + " and " + str2 + " are anagrams? " + isAnagram(str1, str2));

        String str3 = "Hello";
        String str4 = "World";
        System.out.println(str3 + " and " + str4 + " are anagrams? " + isAnagram(str3, str4));
    }
}
