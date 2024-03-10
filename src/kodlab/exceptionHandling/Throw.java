package kodlab.exceptionHandling;

public class Throw {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Erişim reddedildi - Yaşınız 18'den küçük.");
        } else {
            System.out.println("Erişime izin verildi - Yaşınız uygun.");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Bu çağrı bir IllegalArgumentException fırlatacaktır.
    }
}
