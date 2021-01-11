     import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        float w;
        float h;
        Scanner inp = new Scanner(System.in);
        System.out.println("nhap Wight");
        w = inp.nextFloat();
        System.out.println("nhap height");
        h = inp.nextFloat();
        double area = w*h;
        System.out.println("Dien tich HCN la: " + area);
    }
}
