//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BankAccount b1 = new SavingAccount("1AP586RP" , 1000, 0.5);
    BankAccount b2 = new DpsAccount("PY578PH" , 500, 0.8);
    BankAccount b3 = new FixedDepositAccount ("dep1579k" , 7000, 1.2);

    IO.println("b1 Interest is = " + b1.calculateInterest());
    IO.println("b2 Interest is = " + b2.calculateInterest());
    IO.println("b3 Interest is = " + b3.calculateInterest());
}
