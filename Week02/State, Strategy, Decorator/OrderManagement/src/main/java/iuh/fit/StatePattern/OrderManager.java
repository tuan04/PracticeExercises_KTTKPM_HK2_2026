package iuh.fit.StatePattern;

public class OrderManager {
    private State state;

    public OrderManager(){
        state = new NewState();
    }

    public void setState(State state){
        this.state = state;
    }


    public void delivery(){
        this.state.delivery(this);
    }
    public void pay(){
        this.state.pay(this);
    }
    public void cancel(){
        this.state.cancel(this);
    }
}
