public class Rectangle implements Shape{
    double length, width;
    Rectangle(double length , double width ){
        this.length = length ;
        this.width =width;
    }
    @Override
    public double area() {
        return length * width ;
    }

    @Override
    public double perimeter() {
        return 2* (length + width);
    }
}
