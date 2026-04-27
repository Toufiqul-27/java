//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("We will learn encapsulation today");

        Car c1 = new Car();
        c1.setModel("Axio");
        c1.setYear(2025);
        c1.setFuel(1.5);
        c1.hornHorn();
        System.out.println(c1.getFuel() + " " + c1.getPrice());

        Car c2 = new Car( 2025 , " civic");

        c2.refillFuel(20);
        c2.run(5);
        System.out.println(c2.getModel() + " " + c2.getYear());

        Car c3 = new Car("allion", 2025, 25000);
        c3.hornHorn("peep peep");

        Car c4 = new Car("probox", 2025, 100);
        c4.setPrice(2000);
    }
}