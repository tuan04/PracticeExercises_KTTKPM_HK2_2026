package iuh.fit.PaymentSystem;

import iuh.fit.PaymentSystem.Decorator.DiscountDecorator;
import iuh.fit.PaymentSystem.Decorator.PaymentDecorator;
import iuh.fit.PaymentSystem.Decorator.ProcessingCostDecorator;

public class Client {
    public static void main(String[] args) {

        //Sử dụng phương thức thanh toán Paypal
        PaymentMethod paymentMethod1 = new Paypal();

        PaymentMethod paymentMethod2 = new CreditCard();

        // Áp dụng giảm giá
        paymentMethod1 = new DiscountDecorator(paymentMethod1);
        //Áp dụng phí xử lý
        paymentMethod1 = new ProcessingCostDecorator(paymentMethod1);

        PaymentContext paymentContext = new PaymentContext(paymentMethod1);

        paymentContext.transfer(100000);

    }
}
