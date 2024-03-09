package kodlab.dizi;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        for (String i : args) {
            System.out.println(i);
        }


        int dizi[] = {1,3,4,5,2,8,0,2};
        Arrays.sort(dizi);
        int deger = binarySearch(dizi, 3);
        if (deger<0){
            System.out.println("Bulunamadı ");
        }else {
            System.out.println("İndisi " + deger);
        }

        char harf[] ={'r'};
        char harf1[] ={'c'};
        System.out.println(Arrays.equals(harf,harf1));
    }
}
