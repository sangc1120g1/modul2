    import java.util.Scanner;
public class BIM {
    public static void main(String[] args) {
        double w,h;
        Scanner check = new Scanner(System.in);
        System.out.println("nhập vào cân nặng");
        w = check.nextDouble();
        System.out.println("nhập vào chiều cao");
        h = check.nextDouble();
        double bim = w/(Math.pow(h,2));
        if (bim<18.5){
            System.out.println("underweight");
        }
        else if (bim<25.0){
            System.out.println("nomal");
        }
        else if (bim<30.0){
            System.out.println("overweight");
        }else {
            System.out.println("obese");
        }
    }
}
