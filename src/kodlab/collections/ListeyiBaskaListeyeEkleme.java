package kodlab.collections;

import kodlab.ornekProje.restoranSiparisyonetimSistemi.Menu;

import java.util.*;

public class ListeyiBaskaListeyeEkleme {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gül");
        list.add("Papatya");
        list.add("Menekşe");

        List<String> yeniCicek = new ArrayList<>();
        yeniCicek.add("Hakkı");
        yeniCicek.addAll(list); //Diğer listeye ekleme işini addAll yapar
        for (String item:yeniCicek) {
            System.out.println(item);
        }

        List name =new ArrayList<>(); //Tip belirtmediğimiz için her veri tipini alır
        name.add("Hakan");
        name.add(1997);
        name.add(1997);  //setlerden farklı olarak aynı veriyi tutar
        System.out.println(name);

        //Listedeki elemanın yerini değiştirme
        List<Object> sayi = new ArrayList<>();
        sayi.add("Hakan");
        sayi.add("Mehmet");
        sayi.add("Hasan");

        sayi.set(0,"Ahmet");
        System.out.println(sayi.get(1)); //1. indexteki veriyi getir
       // sayi.forEach(System.out::println);
        for (Object item:sayi) {
            System.out.println(item);

        }

        //Liste elemanlarını sıralama
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(2);
        System.out.println("Önceki sıralama : " + number);

        Collections.sort(number); //Listeyi sıralar
        System.out.println("Sonraki sıralama : " + number);


        //Lambda kullanarak sıralama
        List<String> isimList = new ArrayList<>();
        isimList.add("Mete");
        isimList.add("Hakkı");
        isimList.add("İbo");
        System.out.println("Sıralama öncesi: " + "\n" + isimList); //"\n" ifadesi çıktıyı altına yazmaya yarıyor

        isimList.sort(String::compareTo);  //Lambda ile alfavetik sıralama yaptık. :: ifadesi  compareto yapması için verilerin hepsini çağrır
        Collections.reverse(isimList);  //listeyi tersten yazdırmayı istersek
        System.out.println(isimList);

        System.out.println("Sıralama sonrası: " + "\n" + isimList);

        List<String> isimler = List.of("Hakan", "Mehmet", "Hasan"); //Arrays.asList ile aynı ve özelliği parametre alabilmesi
        isimler.forEach(System.out::println);

        var list2 = List.of("Hakan",2); //var anahtar kelimesini de kullanabiliyoruz
        System.out.println(list2);


        }
}
