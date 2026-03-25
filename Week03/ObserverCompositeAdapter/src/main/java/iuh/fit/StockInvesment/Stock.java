package iuh.fit.StockInvesment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Stock {
    private final Set<Investor> investors;
    private final String name;
    private final double price;
    private Status status;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        status = Status.INIT;
        this.investors = new HashSet<>();
    }

    public boolean subscribe(Investor i) {
        return investors.add(i);
    }

    public boolean unsubscribe(Investor i) {
        return investors.remove(i);
    }

    public void setPrice(double price) {
        if (this.price < price) {
            status = Status.DECREASE;
        } else {
            status = Status.INCREASE;
        }
        notifyInvestors(price);
    }

    public void notifyInvestors(double amount) {
        for (Investor i : investors) {
            i.update(name, price, amount, status);
        }
    }
}
