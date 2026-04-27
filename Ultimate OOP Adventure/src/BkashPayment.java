public class BkashPayment extends BankAccount implements OnlinePayment{
    public BkashPayment(String accountHolder, double balance) {
        super(accountHolder, balance);
    }


    @Override
    void showBalance() {
        IO.println("Current balance in bkash = " + balance);
    }

    @Override
    public void pay(double amount) {

            balance -= amount ;
            IO.println("paid by Bkash = " + amount);
            IO.println("Current balance in bkash = " + balance);


    }

    @Override
    public void refund(double amount) {
            balance += amount ;
            IO.println("Refund by Bkash = " + amount);
            IO.println("Current balance in bkash = " + balance);

    }
}
