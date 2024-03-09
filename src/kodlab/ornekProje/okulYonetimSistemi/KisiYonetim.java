package kodlab.ornekProje.okulYonetimSistemi;

import java.util.ArrayList;
import java.util.List;

public class KisiYonetim {

    List<Ogrenci> ogrenciList = new ArrayList<>();
    List<Ogretmen> ogretmenList = new ArrayList<>();

    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciList.add(ogrenci);
    }
    public void ogretmenEkle(Ogretmen ogretmen){
        ogretmenList.add(ogretmen);
    }
    public void ogrenciSil(Ogrenci ogrenci){
        ogrenciList.remove(ogrenci);
    }
    public void ogretmenSil(Ogretmen ogretmen){
        ogretmenList.remove(ogretmen);
    }

    public void ogretmenListele(){
        for (Ogretmen ogretmen: ogretmenList) {
            System.out.println("Öğretmen ismi :" + ogretmen.getName()  + "Öğretmen soyadı : " + ogretmen.getSurname()
                    + "Öğretmen kimlik numarası : " + ogretmen.getIdentityNumber() +
                    "Öğretmen branşı : " + ogretmen.getBranch());
        }
    }

    public void ogrenciListele(){
        for (Ogrenci ogrenci: ogrenciList) {
            System.out.println("Öğrenci ismi :" + ogrenci.getName()  + "Öğrenci soyadı : " + ogrenci.getSurname()
                    + "Öğrenci kimlik numarası : " + ogrenci.getIdentityNumber() +
                    "Öğrenci numarası : " + ogrenci.getStudentNumber());
        }
    }

}
