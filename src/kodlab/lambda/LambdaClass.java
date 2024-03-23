package kodlab.lambda;


public class LambdaClass{
    public static void main(String[] args) {
        //Parametre_Listesi -> yapılacak iş(lambda gövdesi)

        Hesaplama islem = (int a, int b) -> (a+b); //Integer::sum bu şekilde de yazılabilir
        int sonuc = islem.topla(10,15);
        System.out.println(sonuc);

    }

}
