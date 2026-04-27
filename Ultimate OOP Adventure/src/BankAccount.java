public abstract class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(double amount){
        balance += amount ;
        IO.println("deposited = " + amount);
        IO.println("Current = " + balance);
    }
    abstract void showBalance();
}
