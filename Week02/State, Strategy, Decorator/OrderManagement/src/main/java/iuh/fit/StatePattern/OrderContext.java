package iuh.fit.StatePattern;

public class OrderContext {
    private State state;

    public OrderContext() {
        state = new NewState(this);
        System.out.println("Đặt hàng thành công !");
    }

    public void setState(State state) {
        this.state = state;
    }

    public void delivery() {
        this.state.delivery();
    }

    public void pay() {
        this.state.pay();
    }

    public void cancel() {
        this.state.cancel();
    }
}
