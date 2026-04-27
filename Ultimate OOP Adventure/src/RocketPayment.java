public class RocketPayment extends BankAccount implements OnlinePayment{
    public RocketPayment(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void showBalance() {
        IO.println("Current balance in Rocket = " + balance);
    }

    @Override
    public void pay(double amount) {
        balance -= amount ;
        IO.println("paid by Rocket = " + amount);
        IO.println("Current balance in Rocket = " + balance);
    }

    @Override
    public void refund(double amount) {
        balance += amount ;
        IO.println("Refund by Rocket = " + amount);
        IO.println("Current balance in Rocket = " + balance);
    }
}
