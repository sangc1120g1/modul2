import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập số tiền");
        long money = check.nextLong();
        System.out.println("nhập lãi suất");
        double interest = check.nextDouble();
        System.out.println("nhập số tháng");
        int year = check.nextInt();
        double total = money * ((interest / 100) / 12) * year + money;
        System.out.println("Tổng số tiền nhận đc là: " + total);
    }
}
