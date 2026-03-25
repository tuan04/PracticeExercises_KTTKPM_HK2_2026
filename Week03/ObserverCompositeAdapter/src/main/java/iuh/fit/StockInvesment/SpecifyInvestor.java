package iuh.fit.StockInvesment;

public class SpecifyInvestor implements Investor {
    private String name;

    public SpecifyInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double updatedPrice, double oldPrice, Status status) {
        String message = "Vừa " + status.getLabel() + " " + Math.round(Math.abs(updatedPrice - oldPrice)) + " \n" +
                "Hiện tại là " + updatedPrice;
        System.out.println("Xin chào: " + name);
        System.out.println("Cổ phiếu bạn đang quan tâm: " + stockName);
        System.out.println(message + "\n");
    }
}
