package kodlab.ornekProje.restoranSiparisyonetimSistemi;

import java.util.ArrayList;
import java.util.List;

public class Siparis {

    private final List<Food> siparisList = new ArrayList<>();
    private double totalPrice;

    public void addFood(Food food){
        siparisList.add(food);
        totalPrice += food.getPrice();

    }

    public void yemekCikar(String name) {
        Food silinecekYemek = null;
        for (Food food : siparisList) {
            if (food.getName().equalsIgnoreCase(name)) {
                silinecekYemek = food;
                break;
            }
        }
        if (silinecekYemek != null) {
            siparisList.remove(silinecekYemek);
            System.out.println(name + " sipariş listesinden çıkarıldı.");
        } else {
            System.out.println(name + " sipariş listesinde bulunamadı.");
        }
    }
    public void summarySiparis(){
        if (siparisList.isEmpty()){
            System.out.println("Sipariş listesi boş");
        }else {
            System.out.println("Sipariş özeti :");
            for (Food food: siparisList) {
                System.out.println(food.getName() + " - " + food.getPrice() + " TL");
            }
            System.out.println("Toplam Tutar : " + totalPrice);
        }
    }

}
