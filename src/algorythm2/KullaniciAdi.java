package algorythm2;

import java.util.Scanner;

public class KullaniciAdi {
    public static void main(String[] args) {
        String username;
        String password;
        int secim;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        username = scanner.nextLine();
        System.out.println("Şifrenizi giriniz");
        password = scanner.nextLine();


        if (username.equals("Hakan")  && password.equals("aslanamca") ){
            System.out.println("Login succesfully");
        }else {
            System.out.println("Yanlış şifre");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?" + "1-Evet\n2-Hayır");
            System.out.println("Seçiminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();
            if (secim == 1){
                System.out.println("Yeni şifrenizi giriniz: ");
                password = scanner.nextLine();
                if (password.equals("aslanamca")){
                    System.out.println("Yeni şifre eskisiyle aynı olamaz");
                }else {
                    System.out.println("Şifre başarıyla oluşturuldu");
                }
            } else if (secim == 2) {
                System.out.println("İşleminiz sonlandırıldı. ");

            }else {
                System.out.println("geçersiz işlem");
            }

        }
    }
}
