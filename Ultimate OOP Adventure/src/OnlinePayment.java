public interface OnlinePayment {
    void pay(double amount);
    void refund(double amount);
}
