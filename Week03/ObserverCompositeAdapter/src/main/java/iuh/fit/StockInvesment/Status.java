package iuh.fit.StockInvesment;

public enum Status {
    INCREASE("tăng"),
    DECREASE("giảm"),
    INIT("khởi tạo");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}