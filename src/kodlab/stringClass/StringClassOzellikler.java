package kodlab.stringClass;

import java.util.List;
import java.util.stream.Collectors;

public class StringClassOzellikler {
    public static void main(String[] args) {
        //KARAKTER UZUNLUĞU
        String i = "HAKAN SAĞLAM";
        System.out.println("Toplam karakter sayısı : " + i.length());

        //STRİNG İFADELERİ BİRLEŞTİRMEK
        String d1 = "Hakkı";
        String d2 = "Usta";
        String d3 = d1 + d2;

        System.out.println("String ifadeleri birleştirme : " + d3);

        //CONCAT METODU İLE STRİNG İFADELERİ BİRLEŞTİRME
        String e1 = "Hakkı";
        String e2 = "Usta";
        String e3 = e1.concat(e2);
        System.out.println("String ifadeleri birleştirme : " + e3);


        //STRİNG İFADELERİ KARŞILAŞTIRMA
        String a = "Hakan";
        String b = "hakan";

        boolean c = a.equals(b); //Büyük küçük harf duyarlılığı vardır
        boolean d = a.equalsIgnoreCase(b); //Büyük küçük harf duyarlılığı vardır
        System.out.println(c);
        System.out.println(d);

        //COMPARETO VE COMPARETOIGNORECASE (İki string nesnesinin hangisinin büyük olduğunu söyler(Sözlük sıralamasında))
        String name = "Hakar";
        String name1 = "Hakan";
        System.out.println(name.compareToIgnoreCase(name1));

        //STRİNG İFADELER BAŞLANGIÇ VE BİTİŞ KONTROL
        String isim = "JAVA KODLAMA DİLİ";
        boolean kontrol;

        kontrol = isim.startsWith("JAVA");
        System.out.println(kontrol);
        kontrol = isim.endsWith("İ");
        System.out.println(kontrol);

        //STRİNG İÇERİSİNDEKİ KAREKTERE ULAŞMAK
        String alfabe = "hjdghjgdhjfghdjgfkjfh";
        System.out.println("String ifadenin indeksi: " + alfabe.charAt(0));

        //STRİNG NESNEYİ KARAKTER DİZİNE DÖNÜŞTÜRME
        String t = "hjdghjgdhjfghdjgfkjfh";
        System.out.println(t.toCharArray());

        //STRİNG İÇİNDE KARAKTER ARAMA. Varsa pozitif yoksa negatif değer döner
        String h = "kjdhjkbhdjkvhs";
        System.out.println(h.indexOf("b"));

        //STRİNG İÇERİSİNDEN BİR BÖLÜM SEÇME
        String z = "HakanMete";
        System.out.println("3. ve 7. indis arasında kalan yer" + z.substring(3,7));

        //STRİNG İÇERİSİNDE KARAKTERİ DEĞİŞTİRME
        String y = "HAKKIUSTASAĞLAM";
        System.out.println("Eski değer: " + y);
        String dizge = "";
        dizge = y.replace('H', 'I');
        System.out.println("Yeni değer :" + dizge);

        //STRİNG İFADENİN YANINDAKİ BOŞLUKLARI SİLME
        String ifade = "   HAKAN SAĞLAM   ";
        System.out.println(ifade.trim());

        //STRİNG İFADEYİ BÜYÜK VE KÜÇÜK HARFLE YAZMA
        String x = "hakan";
        System.out.println(x.toUpperCase());
        String q = "HAKAN";
        System.out.println(q.toLowerCase());

        //VERİ TİPLERİNİ STRİNGE ÇEVİRME
        int e = 10;
        String s = "";
        s = String.valueOf(e);
        System.out.println(s);


        //REPEAT METODU İLE STRİNG İFADEYİ TEKRARLAMA
        String metin = "REPEAT";
        System.out.println(metin.repeat(3));

        //BOŞ KONTROLÜ YAPMA. Stringin içi tamamen boş mu değil mi?
        String f = "HAKAN SAĞLAM";
        System.out.println(f.isBlank());

        //STRİNG İFADEYİ SATIRLARA BÖLME
        String g = "Merhaba \nben \rhakan";
        System.out.println(g);
        List satırList = g.lines().collect(Collectors.toList());
        System.out.println(satırList);


        //METİN BLOKLARINI DÜZENLEME
        String l = """ 
                   Merhaba ben 
                   java çalışıyorum 
                   """;
        System.out.println(l);


    }
}
