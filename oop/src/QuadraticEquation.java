import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập a");
        double a = check.nextDouble();
        System.out.println("nhập b");
        double b = check.nextDouble();
        System.out.println("nhập c");
        double c = check.nextDouble();
        myquadraticEquation MyQuadraticEquation = new myquadraticEquation(a,b,c);
        System.out.println(MyQuadraticEquation.experience());
    }
}
class myquadraticEquation{
    double a,b,c;
    public myquadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double geta(){
        return this.a;
    }
    public double getb(){
        return this.b;
    }
    public double getc(){
        return this.c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return delta;
    }
    public String experience(){
        if (this.getDiscriminant()>0){
            double x1 = ((-this.b)+Math.sqrt(this.getDiscriminant()))/(2*this.a);
            double x2 = ((-this.b)-Math.sqrt(this.getDiscriminant()))/(2*this.a);
            return "pt có 2 nghiệm x1 là : "+x1+", x2 là : "+x2;
        }
        else if (this.getDiscriminant()==0){
            double x = (-this.b)/(2*this.a);
            return "pt có nghiệm kép là : "+x;
        }
        else {
            return "pt vô nghiệm";
        }
    }
}