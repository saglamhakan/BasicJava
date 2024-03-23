package kodlab.lambda;

public class MetotReferansı {

    public static void staticMetot(){
        System.out.println("Metot referansıyla çağırıldım ");
    }

    public static void main(String[] args) {
        Arayuz1 lambda = () -> System.out.println("Bu bir lambda ifadesidir");
        lambda.ekranaYaz();

        Arayuz1 metotRef = MetotReferansı::staticMetot;
        metotRef.ekranaYaz();
    }

}
