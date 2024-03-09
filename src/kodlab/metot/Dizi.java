package kodlab.metot;

public class Dizi {
    public static void main(String[] args) {

        int dizi[] = new int[]{3,5,7};
        islemYap(dizi);
        for (int i: dizi) {
            System.out.println(i);
        }
    }
    static void islemYap(int dizi[]){
        for (int i = 0; i < 3; i++) {
            dizi[i] = i*i;
        }
    }
}
