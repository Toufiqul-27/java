public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        IO.println("motorcycle start");
    }

    @Override
    public void stop() {
        IO.println("motorcycle stop");
    }
}
