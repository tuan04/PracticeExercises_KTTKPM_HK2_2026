package iuh.fit.OrderManagement;

public interface State {
    void delivery();

    void pay();

    void cancel();
}
