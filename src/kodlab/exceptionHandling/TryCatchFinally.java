package kodlab.exceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("sonuç: " + c);
        }catch (ArithmeticException e){ //Normalde hata alındığında program durur fakat biz catch içerisinde programı durdurma kullanıcıya hata göster diyoruz
            System.out.println("Hata :" + e);
        }

        int dizi[] = {1,3,5,7};
        try {
            System.out.println(dizi[6]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
