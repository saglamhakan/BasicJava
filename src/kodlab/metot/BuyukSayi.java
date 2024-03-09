package kodlab.metot;

public class BuyukSayi {
    static int buyukSayi;
    public static void main(String[] args) {
       int x = hesapla(7,2);
        System.out.println(x);
    }

    static int hesapla(int a, int b){
        if (a>b){
            buyukSayi=a;

        }else if(a<b){
            buyukSayi =b;
        }
        return buyukSayi;
    }
}
