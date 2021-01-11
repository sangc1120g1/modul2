import java.util.Scanner;
public class checkyear {
    public static void main(String[] args) {
        float year ;
        System.out.println("nhập năm");
        Scanner check = new Scanner(System.in);
        year = check.nextFloat();
        if (year%4==0&&year%100==0&&year%400==0){
            System.out.println(year+" là năm nhuận");
        }
        else {
            System.out.println(year+" méo phải năm nhuận");
        }
    }
}
