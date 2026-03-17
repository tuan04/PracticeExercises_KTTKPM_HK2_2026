package iuh.fit.StatePattern;

public class ProcessingState implements State{

    @Override
    public void delivery(OrderManager orderManager) {
        System.out.println("Đơn hàng đang được giao. Không thể thực hiện hành động !");
    }

    @Override
    public void pay(OrderManager orderManager) {
        System.out.println("Đơn hàng đã được giao thành công !");
        orderManager.setState(new DeliveredState());
    }

    @Override
    public void cancel(OrderManager orderManager) {
        System.out.println("Hủy đơn hàng thành công");
    }
}
