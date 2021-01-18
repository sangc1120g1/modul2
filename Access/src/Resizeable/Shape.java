package Resizeable;

public class Shape {

}
class Circle extends ShaPe implements Resizeable{
    private double Radius;

    Circle(double Radius){
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.Radius = this.Radius*percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
class ShaPe implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;
    public ShaPe(){
    }
    public ShaPe(double width , double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        double a = this.getWidth()*percent;
        double b = this.getLength()*percent;
        this.setWidth(a);
        this.setLength(b);
    }
}
class Rectangle extends ShaPe implements Resizeable{
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double percent) {
        double a = this.getWidth()*percent;
        double b = this.getLength()*percent;
        this.setWidth(a);
        this.setLength(b);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Square extends ShaPe implements Resizeable{
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double percent) {
        double a = this.getWidth()*percent;
        double b = this.getLength()*percent;
        this.setWidth(a);
        this.setLength(b);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
