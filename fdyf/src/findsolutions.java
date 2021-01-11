 import java.sql.SQLOutput;
 import java.util.Scanner;
 import java.util.function.DoubleToIntFunction;

 public class findsolutions {
    public static void main(String[] args) {
        System.out.println("hàm tìm nghiệp pt bậc nhất");
        System.out.println("pt có dạng ax+b=0");
        Scanner check = new Scanner(System.in);
        float a;
        float b;
        System.out.println("nhập số a");
        a = check.nextFloat();
        System.out.println("nhập số b");
        b = check.nextFloat();
        if (a!=0&&b!=0){
            double c = (-b) / a;
            System.out.println("Nghiệm của phương trình là: "+ c);
        }
        else if (b==0&&a==00){
            System.out.println("phương trình có vô số nghiệm");
        }
        else if (a==0&&b!=0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình có 1 nghiệm duy nhất là: 0");
        }
    }
}
