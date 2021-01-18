package Comparable;

import Shape.Shape;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){}
    public ComparableCircle(double Radius){
        super(Radius);
    }
    public ComparableCircle(boolean filled,String color,double radius){
        super(filled, color, radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()){
            return 1;
        }
        else if (getRadius()<o.getRadius()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
class Circle extends Shape {
    private double radius = 1.0;
    private Circle circle;

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(boolean filled,String color,double radius){
        super(filled,color);
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius= "+radius+", which is a subclass of "+super.toString();
    }
}
class check {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(false, "indigo", 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}