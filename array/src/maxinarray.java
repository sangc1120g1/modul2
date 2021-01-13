import java.util.Scanner;

public class maxinarray {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng");
        int a = check.nextInt();
        long[] arr = new long[a];
        if (a<20){
            for (int i = 0; i < a; i++) {
                System.out.println("nhập vào value");
                arr[i] = check.nextLong();
            }
            long max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
        else {
            System.out.println("chạy lại mày ngu mày chết");
            System.exit(1);
        }
    }
}
