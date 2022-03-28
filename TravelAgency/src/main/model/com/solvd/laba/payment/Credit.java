package main.model.com.solvd.laba.payment;

public class Credit implements Ipay {

    @Override
    public void pay() {
        System.out.println("Correct Transaction");
    }

    @Override
    public void rejectPay() {
        System.out.println("Transaction Failed");
    }
}
