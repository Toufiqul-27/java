public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;
    private double fuel;

    // Default constructor
    public Car(){}

    // Parameter constructor
    public Car(int year, String model){
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setYear(int year){
        if(year > 2000){
            this.year = year;
        } else {
            System.out.println("Invalid");
        }
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getFuel(){
        return fuel;
    }

    public double getPrice(){
        return price;
    }

    public int getYear(){
        return year;
    }

    public String getModel(){
        return model;
    }

    public void hornHorn(){
        System.out.println("beep beep");
    }

    public void hornHorn(String type){
        System.out.println(this.model + " : " + type);
    }

    public void refillFuel(double fuel){
        this.fuel = this.fuel + fuel;
    }


    public void run(int time){
        double perSecondExpense = 1;
        double totalExpense = perSecondExpense * time;
        this.fuel = this.fuel - totalExpense;
    }

}
