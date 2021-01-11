import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập số");
        int i = Integer.parseInt(check.nextLine());
        for (int j = 2; j <= i; j++) {
            if (i%j==0){
                System.out.println("đéo phải số nguyên tố");
                break;
            }
            else {
                System.out.println("là số nguyên tố");
            }
        }
    }
}
