package iuh.fit.TaxCalculation;

public class VAT extends TaxDecorator {
    public VAT(ProductInterface product) {
        super(product);
    }

    public double getPrice() {
        double price = this.product.getPrice();
        double vat = price * 0.05;

        System.out.println("Áp dụng thuế VAT 5% " + vat);
        return price + vat;
    }
}
