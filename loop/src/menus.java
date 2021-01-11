import java.util.Scanner;

public class menus {
    public static void main(String[] args) {
        while (true){
            System.out.println("menu");
            System.out.println("1: Print the rectangle");
            System.out.println("2: Print the square triangle");
            System.out.println("3: Print isosceles triangle");
            System.out.println("4: Exit");
            Scanner check =  new Scanner(System.in);
            System.out.println("chọn menu");
            int n = check.nextInt();
            System.out.println("nhập độ dài");
            float a = check.nextFloat();
            System.out.println("nhập độ rộng");
            float b = check.nextFloat();
            String s = "";
            switch (n){
                case 1:
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            s += "#";
                        }
                        s += "\n";
                    }
                    System.out.println(s);
                    break;
                case 2:
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j <= i; j++) {
                            s += "#";
                        }
                        s += "\n";
                    }
                    System.out.println(s);
                    break;
                case 3:
                    for (float i = a; i >0; i--) {
                        for (int j = 0; j <= i; j++) {
                            s += "#";
                        }
                        s += "\n";
                    }
                    System.out.println(s);
                    break;
            }
        }
    }
}
