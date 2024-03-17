package genelOrnekler.eTicaret;

import java.util.ArrayList;
import java.util.List;

public class CartManager {

    List<Product> productList = new ArrayList<>();
    private Cart cart = new Cart();

    public void addProductToCart(Product product) {
        cart.getProducts().add(product);
    }

    public Cart getCart() {
        return cart;
    }

    public void deleteProductFromCart(int id){
        Product toRemove = null;
        for (Product item:productList) {
            if (item.getId()==id){
                toRemove=item;
                break;
            }
        }
        if (toRemove != null){
            productList.remove(toRemove);
            System.out.println("Ürün silindi!");
        }else{
            System.out.println("Ürün bulunamadı!");
        }
        }


    public void tutarHesapla(){
        double toplamTutar = 0;
        if (productList.isEmpty()){
            System.out.println("Sepette ürün yok");
        }else {
            for (Product item: productList) {
                toplamTutar += item.getPrice()*item.getQuantity();
            }
            System.out.println("Toplam Tutar: " + toplamTutar);
        }
    }

    public List<Product> getProductList() {
        for (Product item : productList) {
            System.out.println(item);
        }
        return productList;
    }
}
