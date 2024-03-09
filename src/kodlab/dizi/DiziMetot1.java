package kodlab.dizi;

public class DiziMetot1 {
    public static Integer topla(int dizi[]) {
        int total = 0;

        for (Integer i : dizi) {
            total += i;
        }
        if (dizi.length > 0) {
            dizi[0] = total;
        }
        return total;
    }


    public static int carp(int[] dizi){
        int total = 1;
        for (Integer i : dizi){
            total *= i;
        }
        if (dizi.length>0){
            dizi[1] = total;
        }
        return total;
    }

    public static int tekSayiToplami(int[] dizi){
        int total = 0;
        for (int i: dizi) {
            if (i%2 == 1){
                total += i;
            }
            }if (dizi.length>0){
            dizi[2] = total;
        }
        return total;
    }

    public static int çiftSayiToplami(int[] dizi){
        int total = 0;
        for (int i: dizi) {
            if (i%2 == 0){
                total += i;
            }
        }if (dizi.length>0){
            dizi[3] = total;
        }
        return total;
    }


    public static void main(String[] args) {
        int dizi[] = {1, 2, 3, 4,};
        System.out.println(topla(dizi));

        System.out.println(carp(dizi));

        System.out.println(tekSayiToplami(dizi));

        System.out.println(çiftSayiToplami(dizi));
        for (int i: dizi) {
            System.out.print(i + " ");
        }
        }

    }

