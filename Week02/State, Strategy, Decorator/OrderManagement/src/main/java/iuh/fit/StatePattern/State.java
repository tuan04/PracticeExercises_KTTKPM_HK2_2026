package iuh.fit.StatePattern;

public interface State {
    void delivery(OrderManager orderManager);
    void pay(OrderManager orderManager);
    void cancel(OrderManager orderManager);
}
