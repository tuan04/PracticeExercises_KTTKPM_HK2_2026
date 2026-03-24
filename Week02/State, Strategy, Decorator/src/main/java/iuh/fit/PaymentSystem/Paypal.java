package iuh.fit.PaymentSystem;

public class Paypal implements PaymentMethod {
    @Override
    public double transfer(double money) {
        System.out.println("Thanh toán dùng Paypal thành công, số tiền " + money + "đ");
        return money;
    }
}
