package iuh.fit.PaymentSystem;

public class CreditCard implements PaymentMethod {

    @Override
    public double transfer(double money) {
        System.out.println("Thanh toán dùng thẻ tín dụng thành công, số tiền " + money + "đ");
        return money;
    }
}
