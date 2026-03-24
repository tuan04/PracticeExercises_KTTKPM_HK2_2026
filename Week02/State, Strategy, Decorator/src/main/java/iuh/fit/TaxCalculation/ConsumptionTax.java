package iuh.fit.TaxCalculation;

public class ConsumptionTax extends TaxDecorator {
    public ConsumptionTax(ProductInterface product) {
        super(product);
    }

    public double getPrice() {
        double price = this.product.getPrice();
        double tax = price * 0.1;

        System.out.println("Áp dụng thuế tiêu thụ 10% " + tax);
        return price + tax;
    }
}
