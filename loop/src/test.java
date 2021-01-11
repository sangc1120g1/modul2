import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String a = "12345";
        int total = 0;
        for (int i = 0; i < a.length(); i++) {
            total += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        System.out.println(total);
    }
}
