package iuh.fit.OrderManagement;

public class NewState implements State{
    private final OrderContext orderContext;

    public NewState (OrderContext orderContext){
        this.orderContext = orderContext;
    }

    @Override
    public void delivery() {
        System.out.println("Đơn hàng đang được vận chuyển !");
        orderContext.setState(new ProcessingState(orderContext));
    }

    @Override
    public void pay() {
        System.out.println("Đơn hàng chưa được đóng gói !");
    }

    @Override
    public void cancel() {
        System.out.println("Đơn hàng chưa được đóng gói !");
    }
}
