import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        String s ;
        System.out.println("nhập tên");
        s = check.nextLine();
        System.out.println("Hello: "+s);
    }
}
