import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập vào w");
        double a = check.nextDouble();
        System.out.println("nhập vào h");
        double b = check.nextDouble();
        Rectanle rectangle = new Rectanle(a,b);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}
class Rectanle{
    double w,h;
    public Rectanle(double w,double h){
        this.w = w;
        this.h = h;
    }
    public double getArea(){
        return this.w * this.h;
    }
    public double getPerimeter(){
        return (this.w + this.h)*2;
    }
    public String display() {
        return "Rectangle{" + "width=" + w + ", height=" + h + "}";
    }
}
