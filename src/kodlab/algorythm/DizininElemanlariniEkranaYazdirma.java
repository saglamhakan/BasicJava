package kodlab.algorythm;

public class DizininElemanlariniEkranaYazdirma {
    public static void main(String[] args) {
        int dizi[] = new int[]{1,2,19,4,5,6,7,11,9,10,11};

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(i+1 + ". elemanın değeri: " + dizi[i]);
        }
    }
}
