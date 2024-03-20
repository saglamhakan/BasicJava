package genelOrnekler.eTicaret;

import java.time.LocalDate;
import java.util.List;

public class OrderManager {
    private CartManager cartManager;

    public OrderManager(CartManager cartManager) {
        this.cartManager = cartManager;
    }
    public List<Product> getProductList() {
        return cartManager.productList;
    }

    public void siparisOlustur() {
        Cart cart = cartManager.getCart();

        if (cart.getProducts().isEmpty()) {
            System.out.println("Sepette ürün yok");
            return;
        }

        int siparisID = generateOrderId();
        LocalDate siparisTarihi = LocalDate.now();
        String musteriAdi = "Müşteri Adı";
        String siparisDurumu = "Hazırlanıyor";

        Order yeniSiparis = new Order(siparisID, cart, siparisTarihi, musteriAdi, siparisDurumu);

        System.out.println("Sipariş oluşturuldu: " + yeniSiparis);
    }

    private int generateOrderId() {
        // Benzersiz bir sipariş ID'si üretmek için bir yöntem
        return (int) (System.currentTimeMillis() & Integer.MAX_VALUE);
    }


}
