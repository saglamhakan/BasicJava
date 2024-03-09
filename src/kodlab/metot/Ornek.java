package kodlab.metot;

public class Ornek {
    public static void main(String[] args) {
        ekranaYaz();
        carp();
        String isim = yaz();
        System.out.println(isim);
        hesapla(6,5);

    }
    static void ekranaYaz(){
        System.out.println("Hakkı");
    }
    static void carp(){
        System.out.println(3*5);
    }
    static String yaz(){
        return "Mehmet";
    }
    static void hesapla(int a, int b){
        System.out.println(a *b);
    }
}
