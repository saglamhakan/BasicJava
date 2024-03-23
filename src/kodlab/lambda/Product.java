package kodlab.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Product {

    String name;
    double price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;


    }

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Telefon", 500), new Product("Pc", 1000) );
        List<String> listProduct = products.stream().map(Product::toString)
                .collect(Collectors.toList());
        System.out.println(listProduct);
        /*
        List<Product> updatePrice = products.stream().peek(p -> p.setPrice(p.getPrice()*1.10))
                .toList();
        updatePrice.forEach(System.out::println);

         */


    }



}
