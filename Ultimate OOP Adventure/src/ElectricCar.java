public class ElectricCar extends Vehicle{
    public ElectricCar(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
       IO.println("ElectricCar start");
    }

    @Override
    public void stop() {
        IO.println("ElectricCar stop");
    }
}
