package kodlab.dizi;

public class Dizi {
    public static void main(String[] args) {
        int dizi[] = new int[5];
        dizi = new int[]{1,2,3,4,6};

        for (int i = 0; i < 5; i++) {
           // System.out.println(dizi[i]);

        }

        int array[] = {1,3,5,7,9};

        for (int i : array){
            System.out.println(i);
        }

        String array1[] = {"Hakkı", "Mehmet"};
        for (String i: array1) {
            System.out.println(i);
        }

    }
}
