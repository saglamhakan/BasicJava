package kodlab.algorythm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        ArrayList<String> islemGecmisi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        double toplamBakiye = 1000;
        int password;
        boolean accessGranted = false;

        for (int i = 3; i >= 1 && !accessGranted; i--) {
            System.out.println("Şifre giriniz: ");
            password = scanner.nextInt();
            if (password == 1234) {
                System.out.println("Başarılı giriş");
                accessGranted = true;
            } else {
                System.out.println("Hatalı giriş, kalan hakkınız: " + (i - 1));
                if (i == 1) {
                    System.out.println("Hesap bloke olmuştur.");

                }
            }
        }
        if (!accessGranted) {
            System.out.println("Erişim engellendi.");

        } else {
            for (int kalanHak = 3; kalanHak >= 1; kalanHak--) {
                System.out.println("Kalan hakkınız: " + kalanHak);
                System.out.println("1- Para çekme, 2-Bakiye sorma, 3-para yatırma, 4-Çıkış, 5-İşlem Geçmişi");
                System.out.println("Bir işlem seçiniz: ");
                double total;

                int select = scanner.nextInt();
                if (select == 1) {
                    System.out.println("Para tutarı giriniz: ");
                    double tutar = scanner.nextDouble();
                    if ((tutar <= 0)) {
                        System.out.println(tutar + " Bu tutarı giremezsiniz, Tekrar giriş yapınız");
                        break;
                    } else {
                        total = (toplamBakiye - tutar);
                        toplamBakiye = total;
                        System.out.println("Yeni bakiyeniz: " + total);
                        islemGecmisi.add(String.valueOf(total));
                    }

                } else if (select == 2) {
                    System.out.println("Bakiyeniz: " + toplamBakiye);
                    islemGecmisi.add(String.valueOf(toplamBakiye));
                } else if (select == 3) {
                    System.out.println("Para tutarı giriniz: ");
                    double tutar = scanner.nextDouble();
                    if ((tutar <= 0)) {
                        System.out.println(tutar + " Bu tutarı giremezsiniz, Tekrar giriş yapınız");
                        break;
                    } else {
                        total = toplamBakiye + tutar;
                        toplamBakiye = total;
                        System.out.println("Yeni bakiyeniz: " + total);
                        islemGecmisi.add(String.valueOf(total));
                    }


                } else if (select == 4) {
                    System.out.println("Çıkış yaptınız");
                    break;

                } else if (select == 5) {
                    if (islemGecmisi.isEmpty()) {
                        System.out.println("İşlem geçmişiniz bulunmamaktadır");
                    } else {
                        for (String islem : islemGecmisi) {
                            System.out.println(islem);
                        }
                    }
                }
                else
                    System.out.println("Yanlış tercih yaptınız");
            }

        }



            }
        }


