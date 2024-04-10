package br.com.java.restaurante.entities;

public class OrderItem {
    private Product product = new Product();
    private double price;
    private double quantity;

    public OrderItem() {
    }

    public OrderItem(Product product, double price, double quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double subTotal(){
        return price*quantity;
    }
    @Override
    public String toString(){
        return getProduct().getName()
                +", $"
                +String.format("%.2f",price)
                +", Quantity: "
                + quantity
                +", Subtotal: $"
                +String.format("%.2f",subTotal());
    }
}
