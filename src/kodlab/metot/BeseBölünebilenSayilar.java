package kodlab.metot;

public class BeseBölünebilenSayilar {
    public static void main(String[] args) {


        islemYap(1,90);
    }

    static void islemYap(int a, int b){
        for (int i = Math.min(a,b); i <= Math.max(a,b) ; i++) {
            if (i%5 == 0){
                System.out.println(i);
            }
        }

    }

}
