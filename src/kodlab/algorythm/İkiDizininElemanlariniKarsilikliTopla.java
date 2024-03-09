package kodlab.algorythm;

public class İkiDizininElemanlariniKarsilikliTopla {
    public static void main(String[] args) {
        int dizi1[] = {1,3,5,};
        int dizi2[] = {1,3,5,};
        int dizi3[] = new int[3];

        for (int i = 0; i < dizi1.length; i++) {
            dizi3[i] = dizi1[i] + dizi2[i];
        }

        for (int i = 0; i < dizi3.length; i++) {
            System.out.println(dizi3[i]);
        }
    }
}
