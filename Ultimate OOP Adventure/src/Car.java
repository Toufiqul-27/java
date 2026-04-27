public class Car extends Vehicle{
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        IO.println("car start");
    }

    @Override
    public void stop() {
        IO.println("car stop");
    }
}
