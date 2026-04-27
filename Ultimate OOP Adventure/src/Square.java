public class Square implements Shape{
    double s;
    Square(double s){
        this.s = s;
    }
    @Override
    public double area() {
        return s * s ;
    }

    @Override
    public double perimeter() {
        return 4 * s ;
    }
}
