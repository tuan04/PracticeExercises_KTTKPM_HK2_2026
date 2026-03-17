package iuh.fit.StatePattern;

public class CancelState implements State{

    @Override
    public void delivery(OrderManager orderManager) {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }

    @Override
    public void pay(OrderManager orderManager) {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }

    @Override
    public void cancel(OrderManager orderManager) {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }
}
