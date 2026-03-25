package iuh.fit.StockInvesment;

public class Main {
    public static void main(String[] args) {
        Stock fpt = new Stock("FPT", 76.8);
        Stock bid = new Stock("BIDV", 39.45);

        Investor a = new SpecifyInvestor("Thanh Tuấn");
        Investor b = new SpecifyInvestor("SonTungMTP");
        Investor c = new SpecifyInvestor("Jack J97");
        Investor d = new SpecifyInvestor("Baby Red aka Hùng Xe đạp");


        fpt.subscribe(a);
        fpt.subscribe(b);
        bid.subscribe(a);
        bid.subscribe(c);
        bid.subscribe(c);

        fpt.setPrice(100);
        bid.setPrice(100);

    }
}
