package iuh.fit.TaxCalculation;

public abstract class Product implements ProductInterface {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
