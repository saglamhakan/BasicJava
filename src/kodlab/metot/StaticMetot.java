package kodlab.metot;

public class StaticMetot {
    static int topla(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(StaticMetot.topla(3,5));

        int a= 3, b=4;
        System.out.println(Math.pow(a,b));
    }
}
