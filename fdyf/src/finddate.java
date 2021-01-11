    import java.util.Scanner;
public class finddate {
    public static void main(String[] args) {
        int a ;
        float y;
        Scanner check = new Scanner(System.in);
        System.out.println("nhập năm");
        y = check.nextFloat();
        System.out.println("nhập tháng");
        a = check.nextInt();
        if (y%4==0){
            switch (a){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12:
                case 10:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 31 ngày");
                    break;
                case 2:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 30 ngày");
                    break;
                default:
                    System.out.println("không có tháng "+a+ " trong năm");
            }
        }
        else {
            switch (a){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12:
                case 10:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 31 ngày");
                    break;
                case 2:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 28 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Năm "+y+" là năm nhuận"+", Tháng "+a+" có 30 ngày");
                    break;
                default:
                    System.out.println("không có tháng "+a+ " trong năm");
            }
        }
    }
}
