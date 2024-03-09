package kodlab.metot;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println(hesapla(3,5,6));
    }
    static int hesapla(int x, int y){
        return x + y;
    }
    static int hesapla(int x, int y, int z){
        return x*y*x;
    }
}
