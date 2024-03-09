package algorythm2;

public class ReturnAndVoid {


    public static void sum(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    public static int toplam(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {

       int case1 = toplam(3,5);
       System.out.println(case1);

       sum(5,2);
    }
}
