import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("nhập vào độ dài of mảng");
        int a = check.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhập phần tử");
            int b = check.nextInt();
            arr[i] = b;
        }
        for (int i = 0; i < arr.length/2; i++) {
            int c = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = c ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
