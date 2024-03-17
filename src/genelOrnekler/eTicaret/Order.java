package genelOrnekler.eTicaret;

import java.time.LocalDate;
import java.util.Date;

public class Order {

    private int id;
    private Cart cart;
    LocalDate date;

    private String customer;

    private String orderStatus;

   


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Order(int id, Cart cart, LocalDate date, String customer, String orderStatus) {
        this.id = id;
        this.cart = cart;
        this.date = date;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }





}
