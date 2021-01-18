package Rectangle;
import Shape.*;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(boolean filled,String color,double width,double length){
        super(filled,color);
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
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width = "+width+" and length = "+length+", which is a subclass of"+super.toString();
    }
}
 class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(boolean filled,String color,double side){
        super(filled,color,side,side);
    }
    public double getSide(){
        return getWidth();
    }
     public void setSide(double side) {
         setWidth(side);
         setLength(side);
     }
     @Override
     public void setWidth(double width){
        setSide(width);
     }
     @Override
     public void setLength(double length) {
         setSide(length);
     }
     @Override
     public String toString(){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
     }
 }