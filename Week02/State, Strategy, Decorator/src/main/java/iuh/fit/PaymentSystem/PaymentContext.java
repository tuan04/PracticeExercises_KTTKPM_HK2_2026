package iuh.fit.PaymentSystem;

public class PaymentContext {
    private PaymentMethod method;

    public PaymentContext(PaymentMethod method) {
        this.method = method;
    }

    public void setPaymentMethod(PaymentMethod method) {
        this.method = method;
    }

    public double transfer(double money) {
        method.transfer(money);
        return money;
    }
}
