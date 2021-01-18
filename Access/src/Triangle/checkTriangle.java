package Triangle;

public class checkTriangle {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        String a = myTriangle.toString();
        System.out.println(a);
    }
}
class Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Shape(){
    }
    public Shape(double width , double length){
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
}
class Triangle extends Shape{
    private double side1 = 3.0;
    private double side2 = 5.0;
    private double side3 = 4.0;
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = getPerimeter()/2;
        return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",Area=" + getArea()+
                "Perimeter="+getPerimeter()+
                '}';
    }
}