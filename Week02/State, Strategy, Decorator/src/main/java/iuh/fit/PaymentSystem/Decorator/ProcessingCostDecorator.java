package iuh.fit.PaymentSystem.Decorator;

import iuh.fit.PaymentSystem.PaymentMethod;

public class ProcessingCostDecorator extends PaymentDecorator{
    public ProcessingCostDecorator(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    public double transfer(double money) {
        money += money * 0.1;
        System.out.println("Thu phí xử lý 10%: " + money * 0.1);
        return super.transfer(money);
    }
}
