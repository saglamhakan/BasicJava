package kodlab.algorythm;

public class DizininTümElemanlarınıTopla {
    public static void main(String[] args) {
        int dizi[] = new int[]{1,2,3,4,5,6,7,8,9,55};
        int total = 0;
        for (int i = 0; i < dizi.length; i++) {
            total += dizi[i];

        }
        System.out.println(total);

    }
}
