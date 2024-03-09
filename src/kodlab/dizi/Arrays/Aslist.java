package kodlab.dizi.Arrays;

import java.util.Arrays;
import java.util.List;

public class Aslist {
    public static void main(String[] args) {
        String[] dizi = new String[3];
        dizi = new String[]{"Hakkı", "Mehmet", "Ahmet"};

        Integer[] dizi1 = {1,3,5,7};

        List<String> list1 = Arrays.asList(dizi);
        List<Integer> list2 = Arrays.asList(dizi1);

        System.out.println(list1.get(0));
        System.out.println(list2.contains(1));
    }
}
