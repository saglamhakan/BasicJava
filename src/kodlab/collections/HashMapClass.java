package kodlab.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>(); //Verilerin sırası karışık olarak verilir
        hashMap.put("Hakan", 1997);
        hashMap.put("Mehmet", 1995);
        hashMap.put("Hasan", 1987);

        Set<Map.Entry<String, Integer>> veri = hashMap.entrySet(); //Sadece set olarak da yazabilirdik
        Set<String> anahtar = hashMap.keySet();

        veri.forEach(System.out::println);
        anahtar.forEach(System.out::println);

        HashMap<String, Integer> meyveFiyatlari = new HashMap<>();

        meyveFiyatlari.put("Elma", 3);
        meyveFiyatlari.put("Muz", 4);
        meyveFiyatlari.put("Portakal", 2);

        System.out.println(meyveFiyatlari);
        Integer elmaFiyat = meyveFiyatlari.get("Elma");
        String muzFiyat = String.valueOf(meyveFiyatlari.get("Muz"));
        System.out.println("Elmanın Fiyatı: " + elmaFiyat);
        System.out.println("Muzun Fiyatı: " + muzFiyat);
    }
    }

