public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }

    double calculateInterest (){
        return balance * interestRate * 1.5;
    }
}
