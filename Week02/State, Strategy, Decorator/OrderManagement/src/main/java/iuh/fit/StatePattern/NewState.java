package iuh.fit.StatePattern;

public class NewState implements State{

    @Override
    public void delivery(OrderManager orderManager) {
        System.out.println("Đơn hàng đang được vận chuyển !");
        orderManager.setState(new ProcessingState());
    }

    @Override
    public void pay(OrderManager orderManager) {
        System.out.println("Đơn hàng chưa được đóng gói !");
    }

    @Override
    public void cancel(OrderManager orderManager) {
        System.out.println("Đơn hàng chưa được đóng gói !");
    }
}
