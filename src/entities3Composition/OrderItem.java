package entities3Composition;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantitiy, Double price, Product product) {
        this.quantity = quantitiy;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantitiy() {
        return quantity;
    }

    public void setQuantitiy(Integer quantitiy) {
        this.quantity = quantitiy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return price * quantity;
    }

    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
