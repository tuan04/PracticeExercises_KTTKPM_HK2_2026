package iuh.fit.StatePattern;

public class DeliveredState implements State{
    @Override
    public void delivery(OrderManager orderManager) {
        System.out.println("Đơn hàng đã được giao ! Không thể thực hiện hành động");
    }

    @Override
    public void pay(OrderManager orderManager) {
        System.out.println("Đơn hàng đã thanh toán ! Không thể thực hiện hành động");
    }

    @Override
    public void cancel(OrderManager orderManager) {
        System.out.println("Hủy đơn hàng thành công");
        orderManager.setState(new CancelState());
    }
}
