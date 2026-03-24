package iuh.fit.OrderManagement;

public class ProcessingState implements State {
    private final OrderContext orderContext;

    public ProcessingState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void delivery() {
        System.out.println("Đơn hàng đang được giao. Không thể thực hiện hành động !");
    }

    @Override
    public void pay() {
        System.out.println("Đơn hàng đã được giao thành công !");
        orderContext.setState(new DeliveredState(orderContext));
    }

    @Override
    public void cancel() {
        System.out.println("Hủy đơn hàng thành công");
    }
}
