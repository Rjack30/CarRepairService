package DAO;

public class Billing {
    private int paymentMethod;
    private String type;


    public Billing(int paymentMethod, String type) {
        this.paymentMethod = paymentMethod;
        this.type = type;
    }

    public Billing(String s, int i, Mechanic person2) {
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public String getType() {
        return type;
    }






}
