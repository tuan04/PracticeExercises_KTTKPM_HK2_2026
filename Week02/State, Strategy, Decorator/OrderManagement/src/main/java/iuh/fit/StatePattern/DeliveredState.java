package iuh.fit.StatePattern;

public class DeliveredState implements State{
    private final OrderContext orderContext;

    public DeliveredState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }
    @Override
    public void delivery() {
        System.out.println("Đơn hàng đã được giao ! Không thể thực hiện hành động");
    }

    @Override
    public void pay() {
        System.out.println("Đơn hàng đã thanh toán ! Không thể thực hiện hành động");
    }

    @Override
    public void cancel() {
        System.out.println("Hủy đơn hàng thành công");
        orderContext.setState(new CancelState(orderContext));
    }
}
