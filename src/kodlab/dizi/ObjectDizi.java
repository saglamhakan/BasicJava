package kodlab.dizi;

import java.util.Arrays;

public class ObjectDizi {
    public static void main(String[] args) {
        Object dizi[] = new Object[3];   //Object nesnesinden dizi oluşturursan her tip referansı alor
        dizi[0] = "Mehmeet";
        dizi[1] = 3;
        dizi[2] = 1;

        int array[] = new int[]{1,4,9};
        System.out.println(array);

        for (Object i: dizi) {
            System.out.println(i);
        }

        int dizi1[] = new int[]{1,7,2,5,1,9,};  //Dizideki elemanları sıralamak için Arrayssort yazılır
        Arrays.sort(dizi1);
        for (int i: dizi1) {
            System.out.println(i);
        }
    }
}
