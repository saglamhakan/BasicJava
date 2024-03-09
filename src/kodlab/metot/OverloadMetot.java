package kodlab.metot;

public class OverloadMetot {
    public static void main(String[] args) {

        System.out.println(hesapla(2,3));
        System.out.println(hesapla(2,3,4));
    }

    static int hesapla(int a, int b, int c){
        return a*b*c;
    }
    static int hesapla(int a, int b){
        return a*b;
    }
}
