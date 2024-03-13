package kodlab.algorythm;

public class Dongu {
    public static void main(String[] args) {

        int i =10, j=0, k=0;
        while (i>j){
            System.out.println("i , jden büyük");
            i-=2;
            j+=2;
            k++;
        }
        System.out.println("Artık büyük değil");
        System.out.println("işlem " + k + "kere döndü");
    }

}
