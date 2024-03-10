package kodlab.exceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int dizi[] = {1,3,5};
        try {
            System.out.println(dizi[0]);
            System.out.println(dizi[1]);
            System.out.println(dizi[2]);
            System.out.println(dizi[3]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally bloğu");
        }
    }
}
