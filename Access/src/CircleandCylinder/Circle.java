package CircleandCylinder;

 public class Circle {
    private double Radius;
    private String color;

    public Circle(double radius, String color) {
        this.Radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Radius * Radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                ", color='" + color + '\'' +
                '}';
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getsurroundingarea() {
        return (2 * Math.PI * getRadius() * height);
    }

    public double totalarea() {
        return (2 * Math.PI * getRadius() * (getRadius() + height));
    }

    public double volume() {
        return (Math.PI * Math.pow(getRadius(), 2) * height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "volume =" + volume() +
                "color ="+ getColor()+
                '}';
    }
}
class check {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5,"blue");
        Cylinder myCylinder = new Cylinder(5,"red",5);
        String a = myCircle.toString();
        String b = myCylinder.toString();
        System.out.println(a);
        System.out.println(b);
    }
}
