package genelOrnekler.eTicaret;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Product> productList = new ArrayList<>();
    Product product = new Product();

    public void addProduct(Product product){
        productList.add(product);
    }
    public void deleteProduct(int id) {
        Product toRemove = null;
        for (Product item : productList) {
            if (item.getId() == id) {
                toRemove = item;
                break;
            }
        }
        if (toRemove != null) {
            productList.remove(toRemove);
        } else {
            System.out.println("Ürün bulunamadı");
        }
    }


    public void listProduct(){
        for (Product item: productList) {
            System.out.println(item);
        }
    }


    public void sellProduct(int quantity, int id){
       Product foundProduct = null;
        for (Product item:productList) {
            if (item.getId() == id){
                foundProduct = item;
                break;
            }
        }
        if (foundProduct == null){
            System.out.println("Bu id ye ait ürün bulunamadı");
        }else if (product.getQuantity()< quantity){
            System.out.println("Yeterli stok yok. Mevcut stok: " + foundProduct.getQuantity());
        }else {
            int kalanStok = product.getQuantity()-quantity;
            product.setQuantity(kalanStok);
            System.out.println(quantity + " adet ürün satıldı. Kalan stok: " + foundProduct.getQuantity());

        }

    }

    public void stokKontrol(int id) {
        boolean varMi = false;
       if (productList.isEmpty()){
           System.out.println("Ürün kalmadı");
       }else{
           for (Product item: productList) {
              if (item.getId() == id){
                  varMi = true;
                  break;
              }
           }
           if (varMi){
               System.out.println("Ürün stokta mevcut");
           }else
               System.out.println("Ürün stokta yok");
       }
    }

    }

