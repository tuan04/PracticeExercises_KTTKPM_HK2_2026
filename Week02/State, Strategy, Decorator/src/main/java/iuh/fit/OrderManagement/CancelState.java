package iuh.fit.OrderManagement;

public class CancelState implements State {
    private final OrderContext orderContext;

    public CancelState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    @Override
    public void delivery() {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }

    @Override
    public void pay() {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }

    @Override
    public void cancel() {
        System.out.println("Đơn hàng đã hủy ! Không thể thực hiện hành động!");
    }
}
