package iuh.fit.PaymentSystem.Decorator;

import iuh.fit.PaymentSystem.PaymentMethod;

public abstract class PaymentDecorator implements PaymentMethod {
    protected PaymentMethod paymentMethod;

    public PaymentDecorator(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }


    @Override
    public double transfer(double money) {
        paymentMethod.transfer(money);
        return money;
    }
}
