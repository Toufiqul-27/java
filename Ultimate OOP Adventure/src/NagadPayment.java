public class NagadPayment extends BankAccount implements OnlinePayment{
    public NagadPayment(String accountHolder, double balance) {
        super(accountHolder, balance);
    }


    @Override
    void showBalance() {
        IO.println("Current balance in Nagad = " + balance);
    }

    @Override
    public void pay(double amount) {
        balance -= amount ;
        IO.println("paid by Nagad = " + amount);
        IO.println("Current balance in Nagad = " + balance);
    }

    @Override
    public void refund(double amount) {
        balance += amount ;
        IO.println("Refund by NAgad = " + amount);
        IO.println("Current balance in NAgad = " + balance);
    }
}
