package genelOrnekler.eTicaret;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Cart() {
        this.products = new ArrayList<>();
    }
}
