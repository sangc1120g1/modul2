import java.util.Scanner;

public class convertmoney {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Input monney");
        float money = Float.parseFloat(check.nextLine());
        float US = money*23000;
        float VND = money/23000;
        System.out.println("Money");
        String moneys = check.nextLine();
        if (moneys.equals("USA")){
            System.out.println(US);
        }
        else if (moneys.equals("VND")){
            System.out.println(VND);
        }
        else {
            System.out.println("méo chuyển đc");
        }
    }
}
