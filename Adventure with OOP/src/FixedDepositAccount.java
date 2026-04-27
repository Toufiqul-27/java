public class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, interestRate);
    }
    double calculateInterest(){
        return balance * interestRate * 5;
    }
}
