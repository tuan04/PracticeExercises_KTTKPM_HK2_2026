package iuh.fit.TaxCalculation;

public class Main {
    public static void main(String[] args) {

        Product keyboard = new Keyboard(500000);

        TaxDecorator decorator = new VAT(keyboard);
        decorator = new ConsumptionTax(decorator);

        System.out.println("Gía của bàn phím sau khi áp dụng thuế: " + decorator.getPrice());
        System.out.println("Giá gốc của bàn phím: " + keyboard.getPrice());
    }
}