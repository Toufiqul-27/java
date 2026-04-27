public class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;

    public BankAccount (String accountNumber, double balance , double interestRate ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

   public void deposit( double amount ){
        balance += amount ;
    }
   public void withdraw(double amount){
        balance -= amount;
    }
    double calculateInterest(){
        return balance * interestRate ;
    }
}
