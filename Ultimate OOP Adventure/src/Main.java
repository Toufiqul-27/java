//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Vehicle c1 = new Car ("Toyota" , 2020);
        c1.displayInfo();
        c1.start();
        c1.stop();
        Vehicle m1 = new Motorcycle( "rx100", 2020);
        m1.displayInfo();
        m1.start();
        m1.stop();
        Vehicle e1 = new ElectricCar("tesla",2025);
        e1.displayInfo();
        e1.start();
        e1.stop();

        Shape a = new Circle( 5);
        IO.println(" area : " + a.area());
        IO.println(" perimeter : " + a.perimeter());


        Shape b = new Rectangle(5 ,3);
        IO.println(" area : " + b.area());
        IO.println(" perimeter : " + b.perimeter());

        Shape c = new Square(4);
        IO.println(" area : " + c.area());
        IO.println(" perimeter : " + c.perimeter());

        BankAccount b1 =new BkashPayment("toufiqul" , 1000000);
        b1.deposit(500);
        b1.showBalance();

        BankAccount b2 = new NagadPayment("ovi",5000);
        b2.deposit(1000);
        b2.showBalance();

        BankAccount b3 = new RocketPayment("islam", 48111);
        b3.deposit(5400);
        b3.showBalance();


        NotificationSystem n1 = new EmailNotifier();
        n1.sendNotification("hello");
        n1.checkStatus();

        NotificationSystem n2 = new SmsNotifier();
        n2.sendNotification("hi");
        n2.checkStatus();

        NotificationSystem n3 = new PushNotifier();
        n3.sendNotification(" ami pari nah");
        n3.checkStatus();



}
