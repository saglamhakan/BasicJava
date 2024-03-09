package kodlab.metot;

public class RecursionMetot {
    static int fact(int sayi){
        if (sayi==1){
            return 1;
        }else {
            return (sayi*(fact(sayi-1)));
        }
    }

    static int topla(int number){
        if (number == 0){
            return 0;
        }else {
            return (number + topla((number-1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(topla(4));
    }
}
