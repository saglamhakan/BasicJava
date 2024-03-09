package kodlab.MathClass;

import java.util.Random;

public class MathSinifiOrnekler {
    public static void main(String[] args) {
        //ÜS ALMA

        System.out.println("Üs alma: " + Math.pow(3,4));

        //SAYININ KAREKÖKÜNÜ ALMA
        System.out.println("Karekök alma: " + Math.sqrt(49));

        //SAYININ MUTLAK DEĞERİNİ ALMA
        System.out.println("Mutlak değer alma: " + Math.abs(-1));

        //SAYIYI ALT DEĞERE YUVARLAMA
        System.out.println("Sayıyı alt değere yuvarlama: " + Math.floor(5.9));

        //SAYIYI ÜST DEĞERE YUVARLAMA
        System.out.println("Sayıyı üst değere yuvarlama: " + Math.ceil(8.1));

        //BÜYÜK SAYIYI BULMA
        System.out.println("Büyük sayıyı bulma: " + Math.max(3,5));

        //KÜÇÜK SAYIYI BULMA
        System.out.println("Küçük sayıyı bulma: " + Math.min(3,5));

        //RASTGELE SAYI ÜRETME - 0-1 arası bir değer döner. Eğer virgülden sonraki kısmı istemiyorsak int casting yapmamız lazım
        System.out.println("Random sayı: " + (int) (Math.random() * 10));

        //RANDOM SINIFI KULLANARAK RASTGELE SAYI ÜRETME
        Random r = new Random();
        int a = r.nextInt(10); //10 a kadar sayı üret demek, nextInt yerine float,double,long gibi değerler girebiliriz
        boolean b = r.nextBoolean(); //Rastgele boolean da üretebiliyoruz
        System.out.println(b);
        System.out.println(a);

        //RADYANI DERECEYE ÇEVİRME
        System.out.println("Radyanı dereceye çevirme : " + Math.toDegrees(0.5));

        //DERECEYİ RADYANA ÇEVİRME
        System.out.println("Dereceyi Radyana çevirme : " + Math.toRadians(57));

        //SİNÜS BULMA
        System.out.println("Sinüs bulma : " + Math.sin(1));

        //TERS SİNÜS BULMA
        System.out.println("Ters sinüs bulma : " + Math.asin(1));

        //COSİNÜS BULMA
        System.out.println("Cosinüs bulma : " + Math.cos(0));

        //TERS COSİNÜS BULMA
        System.out.println("Ters cosinüs bulma : " + Math.acos(1));

        //Pİ SABİTİ
        System.out.println("Pi sabiti : " + Math.PI);

        //LOG METOTLARI
        System.out.println("Logaritma : " + Math.log(10));
    }
}
