import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        while (true) {
            System.out.println("menu");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit ");
            System.out.println("your choice");
            int a = check.nextInt();
            switch (a) {
                case 1:
                    System.out.println("inp Celsius");
                    double fah = check.nextDouble();
                    System.out.println("Fahrenheit = " + temperature(fah));
                    break;
                case 2:
                    System.out.println("inp Fahrenheit");
                    double cel = check.nextDouble();
                    System.out.println("Celsius = " + temperaturef(cel));
                    break;
                default:
                    System.exit(1);
            }
        }
    }

    public static double temperature(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double temperaturef(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
}
