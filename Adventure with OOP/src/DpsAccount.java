public class DpsAccount extends BankAccount {
    public DpsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }

    double calculateInterest(){
        return balance * interestRate * 2 ;
    }
}
