public abstract class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand , int year){
        this.brand = brand;
        this.year = year;
    }
    public abstract void start();
    public abstract void stop();


     public void displayInfo(){
        IO.println(" brand name = " + brand + " " + "year = " + year);
     }
}
