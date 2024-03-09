package kodlab.ornekProje.restoranSiparisyonetimSistemi;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Food> foodList = new ArrayList<>();

    public void addFood(Food food){
        foodList.add(food);
    }

    public void deleteFood(String name){
        for (Food food: foodList) {
            if (food.getName().equals(name)){
                foodList.remove(food);
            }else {
                System.out.println("Bu isimde yemek bulunamadı");
            }
        }

    }
    public void menuGoster() {
        if (foodList.isEmpty()) {
            System.out.println("Menü boş.");
        } else {
            for (Food food : foodList) {
                System.out.println(food.getName() + " - Fiyat: " + food.getPrice() + " TL");
            }
        }
    }
    public Food searchFood(String name){
        for (Food food: foodList) {
            if (food.getName().equals(name)){
                return food;
            }
        }
        return null;

    }

}
