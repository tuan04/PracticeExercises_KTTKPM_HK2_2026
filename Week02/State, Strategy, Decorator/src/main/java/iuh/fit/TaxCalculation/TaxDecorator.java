package iuh.fit.TaxCalculation;

public abstract class TaxDecorator implements ProductInterface {
    protected ProductInterface product;

    public TaxDecorator(ProductInterface product) {
        this.product = product;
    }

    public double getPrice() {
        return product.getPrice();
    }
}
