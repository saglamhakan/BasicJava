package kodlab.dizi;

import java.util.Arrays;

public class MetotDizi {

    public static void main(String[] args) {
        String dizi[] = {"Hakkı", "Mehmet", "Ahmet"};
        System.out.println(Arrays.toString(diziler(dizi)));
    }

    static String[] diziler(String[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = dizi[i].toUpperCase();
        }
        return dizi;

    }
    }


