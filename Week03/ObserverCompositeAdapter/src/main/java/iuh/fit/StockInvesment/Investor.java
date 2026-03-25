package iuh.fit.StockInvesment;

public interface Investor {
    void update(String stockName, double updatedPrice, double oldPrice, Status status);
}
