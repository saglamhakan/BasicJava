package kodlab.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        // String tipinde bir liste oluşturma
        List<String> isimler = new ArrayList<>();
        isimler.add("Hakan");
        isimler.add("Ayşe");
        isimler.add("Mehmet");
        isimler.add("Zeynep");

        // Iterator kullanarak listeyi dolaşma
        Iterator<String> iterator = isimler.iterator();
        while (iterator.hasNext()) { // Sonraki eleman var mı?
            String isim = iterator.next(); // Sonraki elemanı al
            System.out.println(isim);

            // Belirli bir koşulu karşılayan elemanı kaldırma
            // Örneğin, ismi "Mehmet" olan elemanı kaldır
            if ("Mehmet".equals(isim)) {
                iterator.remove(); // Son çağrılan next() metodunun getirdiği elemanı kaldır
            }
        }

        // Kaldırma işleminden sonra listenin son durumu
        System.out.println("Kaldırma işleminden sonra liste: " + isimler);
    }
    }

