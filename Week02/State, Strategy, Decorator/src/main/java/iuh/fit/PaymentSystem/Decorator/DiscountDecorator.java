package iuh.fit.PaymentSystem.Decorator;

import iuh.fit.PaymentSystem.PaymentMethod;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    public double transfer(double money) {
        money -= money * 0.05;
        System.out.println("Bạn được giảm giá 5% " + money * 0.05);
        return super.transfer(money);
    }
}
