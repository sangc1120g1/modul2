import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập số a");
        int a = Integer.parseInt(check.nextLine());
        System.out.println("nhập số b");
        int b = Integer.parseInt(check.nextLine());
        System.out.println(checks(a,b));
    }
    static String checks(int a, int b) {
        if (a < 0 && b < 0) {
            return "đéo có UCLN";
        }
        if (a == 0 && b == 0) {
            return "Mọi số đều là UC";
        }
        if (a%b==0){
            return "UCLN là: "+b;
        }
        if (a < b) {
            return checks(b, a);
        }else {
            return checks(b,a%b);
        }
    }
}
